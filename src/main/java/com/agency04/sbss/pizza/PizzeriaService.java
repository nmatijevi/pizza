package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
public interface PizzeriaService {

    String getName();
    String getAddress();
    Pizza makePizza(Pizza pizza);


}
