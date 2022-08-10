package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService service;

    public UserService(NotificationService notificationService){
        this.service = notificationService;
    }
}
