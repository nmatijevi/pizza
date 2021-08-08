package com.agency04.sbss.pizza;

import org.springframework.stereotype.Component;

public class Francos implements PizzeriaService{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public Pizza makePizza(Pizza pizza) {
        return pizza;
    }
}
