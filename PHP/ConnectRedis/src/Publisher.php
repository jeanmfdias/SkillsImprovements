<?php

namespace Jean\ConnectRedis;

class Publisher
{
    protected \Redis $redis;

    public function __construct()
    {
        $this->redis = new \Redis();
        $this->redis->connect('redis', 6379);
    }

    public function publish(string $queue, string $message): void
    {
        $this->redis->lPush($queue, $message);
    }
}
