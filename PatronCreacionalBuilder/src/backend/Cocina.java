/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import backend.builder.PizzaBuilder;

/**
 *
 * @author HP PAVILON
 */
public class Cocina {
    private PizzaBuilder builder;
 
    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        builder = pizzaBuilder;
    }
    
    public Pizza getPizza() { 
        return builder.getPizza();
    }
 
    public void construirPizza() {
       builder.crearNuevaPizza();
       builder.buildTipo();
       builder.buildMasa();
       builder.buildSalsa();
       builder.buildRelleno();
       builder.buildIngredientes();
    }
}
