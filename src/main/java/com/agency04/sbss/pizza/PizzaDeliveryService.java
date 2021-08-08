package com.agency04.sbss.pizza;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("deliveryService")
public class PizzaDeliveryService  implements PizzeriaDeliveryService  {


    private PizzeriaService pizzeriaService;

    public PizzaDeliveryService(PizzeriaService PizzeriaService){
        this.pizzeriaService = PizzeriaService;
    }

    @Override
    public String orderPizza(Pizza pizza) {
        return pizzeriaService.makePizza(pizza) + "\nYour order should be arriving soon...";
    }






}