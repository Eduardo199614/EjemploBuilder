/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.builder;

/**
 *
 * @author HP PAVILON
 */
public class PizzaPicanteBuilder extends PizzaBuilder {
    
    
    @Override
    public void buildMasa() { 
        pizza.setMasa("cocida"); 
    }
    
    @Override
    public void buildSalsa() { 
        pizza.setSalsa("picante"); 
    }
    
    @Override
    public void buildRelleno() { 
        pizza.setRelleno("pimienta+salchichón"); 
    }
    
    @Override
    public void buildIngredientes() { 
        pizza.setIngredientes("Mozarella+salsa+peperoni"); 
    }

    @Override
    public void buildTipo() {
        pizza.setTipo("Picante");
    }
}
