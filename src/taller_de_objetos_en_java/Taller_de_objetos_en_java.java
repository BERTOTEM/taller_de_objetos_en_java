/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_de_objetos_en_java;


/**
 *Representa una clase Main para la creación de objetos de las clases del paquete Taller_de_objetos_en Java y ejecutar algunas funcionalidades de las clases.
 * @author julian mazo
 */
public class Taller_de_objetos_en_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Creación de un objeto de la clase Persona con cuatro parámetros.
         */
        Person p = new Person("mazo", "arroyave", 1.78f ,68.5f);
        /**
         * Establece el nombre de la persona.
         */
        p.setName("Julian Roberto");
        /**
         * Establece la fecah de nacimiento de la persona.
         */
        p.setDateBirth(1998,8,9);
        /**
         * Imprime el nombre de la persona.
         */
        System.out.println(p.getName());
        /**
         * Imprime los datos de la persona.
         */
        p.getPersonData();
        
         /**
         * Creación de un objeto de la clase Fruta con el parámetro nombre y peso.
         */      
        Fruit F= new Fruit("sandia",2.5f);
        /**
         * Imprime los datos de la fruta.
         */
        F.getNameandAverageWeigh();
        /**
         * Establece el color de la fruta guardada en la primera posicion de la lista  
         */
        F.setColors(0, "Verde");
        /**
         * Establece el color de la fruta guardada en la segunda posicion de la lista  
         */
        F.setColors(1, "Rojo");
        /**
         * Imprime los colores en la lista 
         */
        F.getColors();
        
        
        /**
         * Creaciónde un objeto de la clase Cuenta Bancaria.
         */
        BankAccount A=new BankAccount(1002365478);
        /**
         * Establece que la cuenta esta activada  
         */
        A.setActivated();
        /**
         * Imprime el estado de la ceunta y el numero de esta
         */
        A.getAccountstatus();
        /**
         * Establece que la cuenta esta desactivada  
         */
        A.setOff();
         /**
         * Imprime el estado de la ceunta y el numero de esta
         */
        A.getAccountstatus();
        
        
        /**
         * Creación de un objeto de la clase perro con el parámetro nombre,raza,tamaño.
         */
        Dog D=new Dog("Toto","Criollo",80.9f);
         /**
         * Imprime el nombre del perro
         */
        System.out.println(D.getName());
        /**
         * Imprime la raza del perro
         */
        System.out.println(D.getRace());
        /**
         * Imprime el tamaño del perro
         */
        System.out.println(D.getSize()+" cm");
        /**
         * Establece el color del perro guardada en la primera posicion de la lista  
         */
        D.setColors(0, "Blanco");
        /**
         * Establece el color del perro guardada en la segunda posicion de la lista  
         */
        D.setColors(1, "Negro");
        /**
         * Establece el color del perro guardada en la tercera posicion de la lista  
         */
        D.setColors(2, "Cafe");
        /**
         * Imprime los colores del perro en la lista 
         */
        D.getColors();
        /**
         * Imprime la accion qeu esta haciendo el perro en el momento 
         */
        D.WhatTheDogDoes();
        
        /**
         * Creaciónde un objeto de la clase Martillo con el parámetro material,marca y tipo
         */
        Hammer H = new Hammer("hierro","Stanley","Martillo de bola");
         /**
         * Imprime el tipo de martillo
         */
        System.out.println(H.getHammertype());
         /**
         * Imprime la marcar del martillo
         */
        System.out.println("De marca "+H.getBrand());
         /**
         * Imprime el material del martillo
         */
        System.out.println("De "+H.getMaterial());
         /**
         * Imprime para que se esta utilizando el martillo
         */
        H.WhatTheHammerDoes();
        
         /**
         * Creación de un objeto de la clase libro con el parámetro autor,titulo,numeor de paginas,ISBN,año de publicacion.
         */
        Book B=new Book("Gabriel Garcia Marquez","one hundred years of solitude",471,978006011,1967);
         /**
         * Imprime el titulo del libro
         */
        System.out.println(B.getTitle());
         /**
         * Imprime el nombre del autor
         */
        System.out.println(B.getAuthor());
        /**
         * Establece el un genero del libro guardada en la primera posicion de la lista  
         */
        B.setLiteraryGenre(0, "novela");
        /**
         * Establece el un genero del libro guardada en la segunda posicion de la lista  
         */
        B.setLiteraryGenre(1, "saga familiar");
        /**
         * Establece el un genero del libro guardada en la tercera posicion de la lista  
         */
        B.setLiteraryGenre(2, "ficcion epica");
        /**
         * Establece el un genero del libro guardada en la caurta posicion de la lista  
         */
        B.setLiteraryGenre(3, "alta fantasia");
        /**
         * Imprime los generos que tiene el libro
         */
        B.getLiteraryGenre();
        
        
    
    }}