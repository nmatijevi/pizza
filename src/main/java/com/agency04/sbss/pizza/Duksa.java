package com.agency04.sbss.pizza;


import org.springframework.stereotype.Component;

@Component
public class Duksa implements PizzeriaService {

    @Override
    public String getName() {
        return "Duksa";
    }

    @Override
    public String getAddress() {
        return "Maksimir 10";
    }

    @Override
    public String makePizza(Pizza pizza) {
        return getName() + " na adresi: " + getAddress() + " priprema pizzu: " + pizza.getName();
    }
}
