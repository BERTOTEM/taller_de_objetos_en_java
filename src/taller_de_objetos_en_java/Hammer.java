/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_de_objetos_en_java;

import java.util.Random;

/**
 * Representa un martillo con algunos atributos y funciones 
 * @author julian mazo
 */
public class Hammer {
    /**
     * Representa el material del martillo
     */
    String Material;
    /**
     * Representa la marca del martillo 
     */
    String brand;
    /**
     * Representa el tipo de martillo
     */
    String Hammertype;
    
    /**
     * Crea una instancia de la clase Hammer
     * @param Material parametro de entrada del material del martillo
     * @param brand parametro de entrada de la marca del martillo  
     * @param Hammertype parametro de entrada del tipo de martillo
     */
    public Hammer(String Material, String brand, String Hammertype) {
        this.Material = Material;
        this.brand = brand;
        this.Hammertype = Hammertype;
    } 
    /**
     * Obtiene el material del martillo
     * @return el material del martillo
     */
    public String getMaterial() {
        return Material;
    }
    /**
     * coloca la marca del martillo
     * @param Material la marca del martillo
     */
    public void setMaterial(String Material) {
        this.Material = Material;
    }
    /**
     * Obtiene la marca del martillo
     * @return la marca del martillo
     */
    public String getBrand() {
        return brand;
    }
    /**
     * coloca la marca del martillo
     * @param brand la marca del martillo
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
     * obtiene el tipo del martillo
     * @return el tipo del martillo
     */
    public String getHammertype() {
        return Hammertype;
    }
    /**
     * coloca el tipo de martillo
     * @param Hammertype el tipo de martillo
     */
    public void setHammertype(String Hammertype) {
        this.Hammertype = Hammertype;
    }
    /**
     * Muestra una funcion del martillo la cual es golpear
     */
    private  void Hit(){
     System.out.println("se esta utilizanod en este momento para Golpear \n");
     }
    /**
     * Muestra una funcion del martillo la cual es clavar
     */
    private  void Nail(){
     System.out.println("se esta utilizanod en este momento para clavar \n");
     }
    /**
     * Muestra una funcion del martillo la cual es desclavar
     */
    private void Unnail(){
     System.out.println("se esta utilizanod en este momento para desclavar \n");
     }
    /**
     * Muestra una funcion del martillo la cuar es romper
     */
    private void Break(){
     System.out.println("se esta utilizanod en este momento para romper \n");
     }
    /**
     * Muestra un comportamienro del perro al azar  utilizando java.util.Random y utilizando este numero ramdon para escoger un caso
     */
    public void WhatTheHammerDoes(){
      Random rand = new Random(); //instance of random class
      System.out.println("El martillo tipo "+Hammertype);
      int upperbound = 3;
      int int_random = rand.nextInt(upperbound);
        switch (int_random) {
            case 0 -> Hit();
            case 1 -> Nail();
            case 2 -> Unnail();
            case 3 -> Break();
            default -> System.out.println("nada");
        }
     }
    
    
    
}
