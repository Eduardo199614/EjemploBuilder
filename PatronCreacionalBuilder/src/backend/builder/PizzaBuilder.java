/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.builder;

import backend.Pizza;

/**
 *
 * @author HP PAVILON
 */
public abstract class PizzaBuilder {
    
    protected Pizza pizza;
 
    public Pizza getPizza() { 
        return pizza; 
    }
    
    public void crearNuevaPizza() { 
        pizza = new Pizza(); 
    }

    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
    public abstract void buildIngredientes();
    public abstract void buildTipo();

    
}
