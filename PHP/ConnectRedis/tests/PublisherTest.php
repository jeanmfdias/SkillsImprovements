<?php

namespace Jean\ConnectRedis\Tests;

use Jean\ConnectRedis\Publisher;
use PHPUnit\Framework\TestCase;

class PublisherTest extends TestCase
{
    public function test_publish_calls_lPush_with_correct_queue_and_message(): void
    {
        $redis = $this->createMock(\Redis::class);
        $redis->expects($this->once())
            ->method('lPush')
            ->with('myQueue', 'Hello World');

        $publisher = new Publisher($redis);
        $publisher->publish('myQueue', 'Hello World');
    }

    public function test_publish_calls_lPush_once_per_message(): void
    {
        $redis = $this->createMock(\Redis::class);
        $redis->expects($this->exactly(3))
            ->method('lPush');

        $publisher = new Publisher($redis);
        $publisher->publish('myQueue', 'Message0');
        $publisher->publish('myQueue', 'Message1');
        $publisher->publish('myQueue', 'Message2');
    }

    public function test_publish_uses_the_given_queue_name(): void
    {
        $redis = $this->createMock(\Redis::class);
        $redis->expects($this->once())
            ->method('lPush')
            ->with('ConnectRedis', $this->anything());

        $publisher = new Publisher($redis);
        $publisher->publish('ConnectRedis', 'any message');
    }
}
