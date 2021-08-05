package com.agency04.sbss.pizza;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("deliveryService")
public class PizzaDeliveryService  implements PizzeriaService  {

    String orderPizza(Pizza pizza){
        return "orderPizzaDeliveryService";
    }

    public PizzaDeliveryService() {
    }

    private PizzeriaService pizzeriaService;

    public PizzaDeliveryService(PizzeriaService thePizzeriaService){
        pizzeriaService = thePizzeriaService;
    }

    private Ortolana ortolana;
    @Autowired
    public PizzaDeliveryService(Ortolana ortolana){
        ortolana = ortolana;
    }

    @Override
    public String getName() {
        return ortolana.getName();
    }

    @Override
    public String getAddress() {
        return pizzeriaService.getAddress();
    }

    @Override
    public Pizza makePizza(Pizza pizza) {
        return null;
    }


    PizzeriaServiceSecond pizzeriaServiceSecond;
    private Napoletana napoletana;
    @Autowired
    public void setPizzeriaServiceSecond(Napoletana napoletana) {
        this.napoletana = napoletana;
    }



}