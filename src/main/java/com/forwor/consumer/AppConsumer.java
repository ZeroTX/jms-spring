package com.forwor.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tx on 2017/10/24.
 */
public class AppConsumer {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("consumer.xml");

    }
}
