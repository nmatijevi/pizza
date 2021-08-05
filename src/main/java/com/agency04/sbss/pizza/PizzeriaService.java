package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public interface PizzeriaService {

    String getName();
    String getAddress();
    Pizza makePizza(Pizza pizza);

/*
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("spring-context.xml");


    Pizza pizza = context.getBean("myPizzaOrtolana", Ortolana.class);


 */
}
