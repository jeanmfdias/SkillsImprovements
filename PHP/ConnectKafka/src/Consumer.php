<?php

namespace Jean\ConnectKafka;

use RdKafka\Conf;
use RdKafka\KafkaConsumer;
use RdKafka\ProducerTopic;

class Consumer
{
    protected $consumer;

    public function __construct()
    {
        $conf = new Conf();
        $conf->set('metadata.broker.list', 'kafka:9092');
        $conf->set('group.id', 'group_php');
        $conf->set('enable.auto.commit', 'true');
        $this->consumer = new KafkaConsumer($conf);
    }

    public function subscribe(string $topic): void
    {
        $this->consumer->subscribe([$topic]);
    }

    public function showMessage(): void
    {
        $message = $this->consumer->consume(10000);
        switch ($message->err) {
            case RD_KAFKA_RESP_ERR_NO_ERROR:
                echo $message->payload;
                break;
            case RD_KAFKA_RESP_ERR__PARTITION_EOF:
                break;
            case RD_KAFKA_RESP_ERR__TIMED_OUT:
                echo 'timed out';
                break;
            default:
                var_dump($message);
                throw new \Exception($message->errstr(), $message->err);
        }
    }
}