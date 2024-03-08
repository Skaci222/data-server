package com.sam.project_server;

import com.sam.project_server.model.mqttmessage.MqttMsg;
import com.sam.project_server.model.mqttmessage.MqttMessageDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class ProjectServerApplicationTests {

	@Autowired
	MqttMessageDao messageDao;

	DateFormat dateFormat = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
	String dateString = dateFormat.format(new Date());


	@Test
	void addMsgTest() {
		MqttMsg message = new MqttMsg();
		message.setTopic("temp topic");
		message.setHashKey("Temp");
		message.setValue("25");
		message.setDate(dateString);
		messageDao.save(message);

	}

}
