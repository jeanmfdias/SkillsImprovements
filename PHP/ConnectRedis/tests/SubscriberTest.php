<?php

namespace Jean\ConnectRedis\Tests;

use Jean\ConnectRedis\Subscriber;
use PHPUnit\Framework\TestCase;

class SubscriberTest extends TestCase
{
    public function test_showMessage_prints_received_when_message_is_returned(): void
    {
        $redis = $this->createMock(\Redis::class);
        $redis->method('brPop')
            ->willReturn(['ConnectRedis' => 'Hello World']);

        $subscriber = new Subscriber($redis);

        $this->expectOutputString('[Received] Hello World' . PHP_EOL);
        $subscriber->showMessage('ConnectRedis');
    }

    public function test_showMessage_prints_waiting_when_brPop_returns_false(): void
    {
        $redis = $this->createMock(\Redis::class);
        $redis->method('brPop')
            ->willReturn(false);

        $subscriber = new Subscriber($redis);

        $this->expectOutputString('[Waiting] no messages, retrying...' . PHP_EOL);
        $subscriber->showMessage('ConnectRedis');
    }

    public function test_showMessage_calls_brPop_with_queue_and_timeout(): void
    {
        $redis = $this->createMock(\Redis::class);
        $redis->expects($this->once())
            ->method('brPop')
            ->with(['ConnectRedis'], 10)
            ->willReturn(false);

        $subscriber = new Subscriber($redis);
        $subscriber->showMessage('ConnectRedis');
    }

    public function test_showMessage_prints_received_for_indexed_array_format(): void
    {
        $redis = $this->createMock(\Redis::class);
        $redis->method('brPop')
            ->willReturn(['ConnectRedis', 'Message0']);

        $subscriber = new Subscriber($redis);

        $this->expectOutputString('[Received] Message0' . PHP_EOL);
        $subscriber->showMessage('ConnectRedis');
    }
}
