package com.agency04.sbss.pizza;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public interface PizzeriaDeliveryService {

    String orderPizza(Pizza pizza);
}
