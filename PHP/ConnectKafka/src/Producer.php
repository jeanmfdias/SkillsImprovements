<?php

namespace Jean\ConnectKafka;

use RdKafka\Conf;
use RdKafka\ProducerTopic;

class Producer
{
    protected \RdKafka\Producer $producer;

    public function __construct()
    {
        $conf = new Conf();
        $conf->set('metadata.broker.list', 'kafka:9092');
        $conf->set('bootstrap.servers', 'kafka:9092');
        $this->producer = new \RdKafka\Producer($conf);
    }

    public function createTopic($topicName): ProducerTopic
    {
        return $this->producer->newTopic($topicName);
    }

    public function createMessage(ProducerTopic $topic, string $payload): void
    {
        $topic->produce(RD_KAFKA_PARTITION_UA, 0, $payload);
        $this->producer->poll(0);
    }
}