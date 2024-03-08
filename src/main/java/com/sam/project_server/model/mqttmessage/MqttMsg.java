package com.sam.project_server.model.mqttmessage;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class MqttMsg {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increments
    private int id;
    private String topic;
    private String hashKey;
    private String value;

    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getHashKey() {
        return hashKey;
    }

    public void setHashKey(String hashKey) {
        this.hashKey = hashKey;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MqttMessage{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", hashKey='" + hashKey + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

