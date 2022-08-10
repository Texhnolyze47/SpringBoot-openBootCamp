package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //lee el archivo xml
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // se hace un cast al tipo de objeto que queremos
        Saludo  saludo = (Saludo) context.getBean("saludo");
        String textoSaludo = saludo.imprimirSaludo();

        System.out.println(textoSaludo);

        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.service.imprimirSaludoNS());


    }
}
