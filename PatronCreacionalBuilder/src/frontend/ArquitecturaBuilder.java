/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frontend;

import backend.Cocina;
import backend.Pizza;
import backend.builder.HawaiPizzaBuilder;
import backend.builder.PizzaBuilder;
import backend.builder.PizzaPicanteBuilder;
import java.util.Scanner;

/**
 *
 * @author HP PAVILON
 */
public class ArquitecturaBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cocina cocina = new Cocina(); 

        // Crear los builders
        PizzaBuilder hawaiPizzaBuilder = new HawaiPizzaBuilder();
        PizzaBuilder pizzaPicanteBuilder = new PizzaPicanteBuilder();
        
        int opcion;
        do {
            // Menú para seleccionar el tipo de pizza
            System.out.println("Bienvenido a la pizzería!");
            System.out.println("Seleccione el tipo de pizza:");
            System.out.println("1. Pizza Hawaiana");
            System.out.println("2. Pizza Picante");
            System.out.println("0. Salir");
            System.out.println("Seleccione una pizza: ");
            
            opcion = scanner.nextInt();

            PizzaBuilder pizzaBuilderSeleccionado = null;
            switch (opcion) {
                case 1:
                    pizzaBuilderSeleccionado = hawaiPizzaBuilder;
                    break;
                case 2:
                    pizzaBuilderSeleccionado = pizzaPicanteBuilder;
                    break;
                case 0:
                    System.out.println("Gracias por visitar nuestra pizzería. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida, seleccionando pizza hawaiana por defecto.");
                    pizzaBuilderSeleccionado = hawaiPizzaBuilder;
                    break;
            }

            if (opcion != 0) {
                // Construir la pizza seleccionada
                cocina.setPizzaBuilder(pizzaBuilderSeleccionado);
                cocina.construirPizza(); 
                Pizza pizza = cocina.getPizza(); 

                // Mostrar la información de la pizza por consola
                System.out.println("Pizza: "+ pizza.getTipo());
                System.out.println("Masa: " + pizza.getMasa());
                System.out.println("Salsa: " + pizza.getSalsa());
                System.out.println("Ingredientes: " + pizza.getIngredientes());
            }
        } while (opcion != 0);
    }
    
    
}
