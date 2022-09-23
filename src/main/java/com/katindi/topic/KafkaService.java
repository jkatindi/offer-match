package com.katindi.topic;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.katindi.topic.dto.OfferDTO;

@Service
public class KafkaService {
    @KafkaListener(topics = "topic-offer",groupId = "sample-consumer")
    public void onMessage(ConsumerRecord consumerRecord){
       System.out.println("******************************");
               System.out.println("key="+consumerRecord.key()+" "+
                       consumerRecord.value().toString());
       System.out.println("******************************");
    }
}
