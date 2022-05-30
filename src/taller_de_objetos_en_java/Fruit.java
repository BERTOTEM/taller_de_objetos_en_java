/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_de_objetos_en_java;

import java.util.ArrayList;

/**
 * Representa una fruta con algunos atributos 
 * @author julian mazo
 */
public class Fruit {
    
    /**
     * Representa una lista de los colores de la fruta
     */
    ArrayList<String> colors = new ArrayList<>();
    /**
     * Representa el nombre de la fruta
     */
    String name;
    /**
     * Representa el peso promedio de la fruta
     */
    float averageWeigh;
    
    /**
     * Crea una instancia de la clase Fruit
     * @param name parametro de entrada del nombre de la fruta
     * @param averageWeigh parametro de entrada del pesopromedio de la fruta
     */
    public Fruit(String name, float averageWeigh) {
        this.name = name;
        this.averageWeigh = averageWeigh;
    }
    /**
     * Obtiene los datos de la fruta
     */
    public void getNameandAverageWeigh() {
        System.out.println("Tu fruta elegida es la "+name);
        System.out.println("tiene un peso aproximado de "+averageWeigh+"Kg");
       
   }

    /**
     * creacion de una lista con todos los colores de la fruta
     * @param position posicion de la lista 
     * @param pineappleColors color que se desea agregar
     */
    public void setColors(int position,String pineappleColors ) {    
        colors.add(position,pineappleColors);
    }
    /**
     * Muestra uno por uno cada elemento de la lista de colores de la fruta
     */
    public void getColors() {
        System.out.println("la cual tiene los color");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));}
       System.out.println("\n");
        
    }

   
    
    
}
