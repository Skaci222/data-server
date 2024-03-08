package com.sam.project_server.controller;

import com.sam.project_server.model.mqttmessage.MqttMsg;
import com.sam.project_server.model.mqttmessage.MqttMessageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MqttMessageController {
    @Autowired
    private MqttMessageDao messageDao;

    @GetMapping("/message/get-all")
    public List<MqttMsg> getAllMessages(){
        return messageDao.getAllMessages();
    }

    @PostMapping("/message/save")
    public MqttMsg save(@RequestBody MqttMsg mqttMessage){
        return messageDao.save(mqttMessage);
    }
}
