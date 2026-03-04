<?php

namespace Jean\ConnectRedis;

class Subscriber
{
    protected \Redis $redis;

    public function __construct(?\Redis $redis = null)
    {
        if ($redis !== null) {
            $this->redis = $redis;
            return;
        }

        $this->redis = new \Redis();
        $this->redis->connect('redis', 6379);
    }

    public function consume(string $queue): void
    {
        echo "[Started] Listening on queue: {$queue}" . PHP_EOL;

        while (true) {
            $this->showMessage($queue);
        }
    }

    public function showMessage(string $queue): void
    {
        $result = $this->redis->brPop([$queue], 10);

        if (is_array($result) && count($result)) {
            echo "[Received] " . end($result) . PHP_EOL;
        } else {
            echo "[Waiting] no messages, retrying..." . PHP_EOL;
        }
    }
}
