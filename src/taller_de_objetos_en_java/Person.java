/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_de_objetos_en_java;

import java.time.LocalDateTime;


/**
 * Representa una persona y algunos de los atributos 
 * @author julian mazo
 */
public class Person {
    /**
     * Representa el nombre de la persona
     */
    String name;
    /**
     * Representa el primer apellido de la persona
     */
    String lastname1;
    /**
     * Representa el segundo apellido de la persona
     */
    String lastname2;
    /**
     * Representa la fecha de nacimiento de la persona
     */
    LocalDateTime dateBirth ;
    /**
     * Representa la altura de la persona
     */
    float heigth;
    /**
     * Representa el peso de la persona
     */
    float weight;
    
    
    /**
     * Crea una instancia de la clase persona
     * @param lastname1 parametro de entrada que representa el primer apellido de la persona 
     * @param lastname2 parametro de entrada que representa el segundo apellido de la persona 
     * @param heigth parametro de entrada que representa la altura de la persona
     * @param weight parametro de entrada que representa el peso de la persona
     */
    
    public Person(String lastname1, String lastname2, float heigth, float weight) {
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
        this.heigth = heigth;
        this.weight = weight;
    }

    
    /**
     * obtiene el nombre de la persona
     * @return el nombre de la persona
     */
    public String getName() {
        return name;
    }
    /**
     * obtiene la fecha de nacimiento de la persona
     * @return la fecha de nacimiento
     */
    public float getDateBirth() {
        return heigth;
    }
    /**
     * coloca el nombre de la persona 
     * @param name nombre de la persona
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * coloca la fecha de nacimeinto de la persona
     * @param yyyy año en que nacio la persona
     * @param mm mes en el cual nacio la persona
     * @param dd2 dia el cual nacio la persona
     */
    
    public void setDateBirth(int yyyy,int mm,int dd2) {
        
        this.dateBirth =LocalDateTime.of(yyyy, mm, dd2, 0, 0) ;

    }

 
    /**
     * obtiene todos los datos personales de la persona
     */ 
    public void getPersonData(){
     System.out.println("bienvenido "+name+" "+lastname1+" "+lastname2);
     System.out.println(heigth+" de altura");
     System.out.println(weight+" de peso");
     System.out.println("Fecha de cumpleanos "+dateBirth+"\n");
    
    }
    
    
}
