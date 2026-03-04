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
        $conf->set('bootstrap.servers', 'kafka:9092');
        $conf->set('metadata.broker.list', 'kafka:9092');
        $conf->set('group.id', 'group_php');
        $conf->set('enable.auto.commit', 'true');
        $conf->set('auto.offset.reset', 'earliest');
        $conf->set('topic.metadata.refresh.interval.ms', '1000');
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
                echo "[Received] " . $message->payload . PHP_EOL;
                break;
            case RD_KAFKA_RESP_ERR__PARTITION_EOF:
                break;
            case RD_KAFKA_RESP_ERR__TIMED_OUT:
                echo '[Waiting] timed out, retrying...' . PHP_EOL;
                break;
            case RD_KAFKA_RESP_ERR_UNKNOWN_TOPIC_OR_PART:
                echo '[Waiting] topic not available yet, retrying...' . PHP_EOL;
                break;
            default:
                var_dump($message);
                throw new \Exception($message->errstr(), $message->err);
        }
    }
}