/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_de_objetos_en_java;

import java.util.ArrayList;

/**
 * Representa un libro y algunos de los atributos de este
 * @author julian mazo
 */
public class Book {
     /**
     * Representa el nombre del autor del libro
     */
    String Author;
     /**
     * Representa el titulo del libro
     */
    String Title;
     /**
     * Representa el numero de paginas del libro
     */
    int Numberofpages;
     /**
     * Representa una lista de los generos que plasma el libro
     */
    ArrayList<String> LiteraryGenre = new ArrayList<>();
     /**
     * Representa el codigo internacional del libro que por las siglas en inglés de International Standard Book Number
     */
    long  ISBNcode;
     /**
     * Representa el año en que fue publicado
     */
    long Yearofpublication;
    
    /**
     * Crea una instancia de la clase Book
     * @param Author parametro de entrada para el nombre del autor
     * @param Title parametro de entrada para el titulo del libro
     * @param Numberofpages parametro de entrada para el numeor de paginas del libro
     * @param ISBNcode parametro de entrada para el cogido ISB
     * @param Yearofpublication parametro de entrada para el año de publicacion 
     */
    public Book(String Author, String Title, int Numberofpages, long ISBNcode, long Yearofpublication) {
        this.Author = Author;
        this.Title = Title;
        this.Numberofpages = Numberofpages;
        this.ISBNcode = ISBNcode;
        this.Yearofpublication = Yearofpublication;
    }

    /**
     * Obtiene el nombre del autor
     * @return el nombre del autor
     */
    protected String getAuthor() {
        return Author;
    }
    /**
     * Obtiene el titulo del autor
     * @return el titulo del autor
     */
    protected String getTitle() {
        return Title;
    }
    /**
     * obtiene el numero de paginas del libro
     * @return el numerr de paginas del libro
     */
    protected int getNumberofpages() {
        return Numberofpages;
    }
    /**
     * obtien el codigo ISBN
     * @return  el codigo ISBN
     */

    protected long getISBNcode() {
        return ISBNcode;
    }
    /**
     * obtien el año de publicacion 
     * @return el año de publicacion
     */
    protected long getYearofpublication() {
        return Yearofpublication;
    }
    /**
     * coloca el numeor de paginas del libor
     * @param Numberofpages numeor de paginas del libro
     */
    public void setNumberofpages(int Numberofpages) {
        this.Numberofpages = Numberofpages;
    }
    /**
     * coloca el año de publicacion del libro
     * @param Yearofpublication año de publicacion
     */
    public void setYearofpublication(int Yearofpublication) {
        this.Yearofpublication = Yearofpublication;
    }
    
    /**
     * creacion de una lista con todos los generos del libro
     * @param position posicion de la lista 
     * @param LiteraryGenres genero que se desea agregar
     */
    public void setLiteraryGenre(int position,String LiteraryGenres ) {    
        LiteraryGenre.add(position,LiteraryGenres);
    }
    /**
     * muestra uno por uno cada elemento de la lista de generos
     */
    public void getLiteraryGenre() {
        System.out.println("compuesta por los generos de ");
        for (int i = 0; i < LiteraryGenre.size(); i++) {
            System.out.println(LiteraryGenre.get(i));}
       System.out.println("\n");
        
    }
    
    
}
