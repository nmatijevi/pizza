package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {
        // Add some pizza code


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-context.xml");


        Pizza pizza = context.getBean("ortolana", Ortolana.class);

        Pizza pizza1 = context.getBean("napoletana", Napoletana.class);

        System.out.println(pizza.getName());


        System.out.println(pizza1.getName());

        context.close();

    }

}
