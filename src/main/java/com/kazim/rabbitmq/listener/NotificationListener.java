package com.kazim.rabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.kazim.rabbitmq.model.Notification;

@Service
public class NotificationListener {

    @RabbitListener(queues = "kazim-queue")
    public void handleMessage(Notification notification) {
        System.out.println("Message received..");
        System.out.println(notification.toString());
    }
}
