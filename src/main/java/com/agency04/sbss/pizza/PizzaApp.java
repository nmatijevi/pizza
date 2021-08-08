package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {
        // Add some pizza code


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-context.xml");



        PizzaDeliveryService pizzaDeliveryService =
                context.getBean("pizzaDeliveryService", PizzaDeliveryService.class);
        Ortolana ortolana = new Ortolana();

        System.out.println(pizzaDeliveryService.orderPizza(ortolana));


        context.close();

    }

}
