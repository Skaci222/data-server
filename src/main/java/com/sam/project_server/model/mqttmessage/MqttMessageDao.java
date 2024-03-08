package com.sam.project_server.model.mqttmessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MqttMessageDao {
    @Autowired //dependency injection
    MqttMessageRepository repository;

    public MqttMsg save(MqttMsg mqttMessage){
        return repository.save(mqttMessage);
    }

    public List<MqttMsg> getAllMessages(){
        List<MqttMsg> mqttMessages = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(mqttMessage -> {
                    mqttMessages.add(mqttMessage);
                });
        return mqttMessages;
    }

    public void delete(MqttMsg mqttMessage){
        repository.delete(mqttMessage);
    }
}
