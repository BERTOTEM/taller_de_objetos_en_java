/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_de_objetos_en_java;

import java.util.ArrayList;
import java.util.Random;

/**
 * Representa un perro con algunos atributos y comportamientos 
 * @author julian mazo
 */
public class Dog {
    /**
     * Representa el nombre del perro
     */
    String name;
    /**
     * Representa una lista de los colores del pelaje del perro 
     */
    ArrayList<String> colors = new ArrayList<>();
    /**
     * Representa la raza del perro
     */
    String race;
    /**
     * Representa el tamaño del perro
     */
    float size;
    /**
     * Crea una instancia de la clase Dog
     * @param name parametro de entrada para el nombre del perro
     * @param race parametro de entrada para la raza del perro
     * @param size parametro de entrada para el tamaño
     */
    public Dog(String name, String race, float size) {
        this.name = name;
        this.race = race;
        this.size = size;
    }
    /**
     * Obtiene el nombre del perro
     * @return el nombre del perro
     */
    public String getName() {
        return name;
    }
    /**
     * Obtiene la raza del perro
     * @return la raza del perro
     */
    protected String getRace() {
        return race;
    }
    /**
     * Obtiene el tamaño del perro
     * @return el tamaño del perro
     */
    public float getSize() {
        return size;
    }
     /**
      * Muestra el comportamiento del perro de ladrar
       */
     private  void Bark(){
     System.out.println("Esta ladrando \n");
     }
     /**
      * Muestra el comportamiento del perro de comer
      */
     private  void Eat(){
     System.out.println("Esta comiendo \n");
     }
     /**
      * Muestra el comportamiento del perro de dormir
      */
      private void Sleep(){
     System.out.println("Esta durmiendo \n");
     }
    /**
     * Muestra un comportamienro del perro al azar  utilizando java.util.Random y utilizando este numero ramdon para escoger un caso
     */
    public void WhatTheDogDoes(){
      Random rand = new Random(); //instance of random class
      System.out.println(name+" en este momento  ");
      int upperbound = 2;
      int int_random = rand.nextInt(upperbound);
        switch (int_random) {
            case 0 : Bark();
            case 1 : Eat();
            case 2 : Sleep();
            default : System.out.println("nada");
        }
     }
    
    /**
     * Creacion de una lista con todos los colores del perro
     * @param position posicion de la lista 
     * @param dogcolors color que se desea agregar
     */
     public void setColors(int position,String dogcolors ) {    
        colors.add(position,dogcolors);
    }
    /**
     * Muestra uno por uno cada elemento de la lista de colores del perro
     */
    public void getColors() {
        System.out.println(name+" tiene en su pelaje los colores");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));}
       
        
    }
    
    
    
    
}
