package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public String imprimirSaludoNS(){
        return "Saludo desde Notification Service";
    }
}
