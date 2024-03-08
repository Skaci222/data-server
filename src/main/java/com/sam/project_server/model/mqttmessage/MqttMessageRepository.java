package com.sam.project_server.model.mqttmessage;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MqttMessageRepository extends CrudRepository<MqttMsg, Integer> {
}
