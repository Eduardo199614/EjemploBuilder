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
public class Pizza {
    private String tipo="";
    private String masa = "";
    private String salsa = "";
    private String relleno = "";
    private String Ingredientes="";
    
    public String getTipo() {
       return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(String Ingrediente) {
        this.Ingredientes = Ingrediente;
    }
 
    public void setMasa(String masa) { 
        this.masa = masa; 
    }
    
    public void setSalsa(String salsa) { 
        this.salsa = salsa; 
    }
    
    public void setRelleno(String relleno) { 
        this.relleno = relleno; 
    }

    public String getMasa() {
        return masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public String getRelleno() {
        return relleno;
    }
    
    
}
