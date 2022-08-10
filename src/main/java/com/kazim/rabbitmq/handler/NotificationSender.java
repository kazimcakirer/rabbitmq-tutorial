package com.kazim.rabbitmq.handler;

import java.util.Date;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kazim.rabbitmq.model.Notification;
import com.kazim.rabbitmq.producer.NotificationProducer;

@Component
public class NotificationSender {

    @Autowired
    private NotificationProducer producer;

    public void getThread() {
        Thread thread = new Thread(
                () -> {
                    while (true) {
                        Notification notification = new Notification();
                        notification.setNotificationId(UUID.randomUUID().toString());
                        notification.setCreatedDate(new Date());
                        notification.setMessage("Haydi kodlayalımdan mesaj var...");
                        notification.setSeen(false);
                        producer.sendToQueue(notification);
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
        thread.setName("Notification sender");
        thread.start();
    }

    @PostConstruct
    public void init() {
        getThread();

    }
}
