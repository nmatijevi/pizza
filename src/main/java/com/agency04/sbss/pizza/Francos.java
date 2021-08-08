package com.agency04.sbss.pizza;

import org.springframework.stereotype.Component;


public class Francos implements PizzeriaService{
    @Override
    public String getName() {
        return "Francos";
    }

    @Override
    public String getAddress() {
        return "bundek 20";
    }

    @Override
    public String makePizza(Pizza pizza) {
        return getName() + " na adresi: " + getAddress() + "priprema pizzu: " + pizza;
    }
}
