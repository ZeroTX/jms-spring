package com.forwor.producter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tx on 2017/10/24.
 */
public class AppProductor {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("productor.xml");
        ProducterService service = context.getBean(ProducterService.class);
        for (int i=0;i<100;i++){
            service.sendMessage("测试订阅0000"+i);
        }
        context.close();
    }
}
