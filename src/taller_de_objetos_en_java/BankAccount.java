/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_de_objetos_en_java;

/**
 *Representa una cuenta de banco que puede controlar su activacion
 * @author julian mazo
 */
public class BankAccount {
    /**
     * Representa el numero de la cuenta
     */
    int accountNumber;
    /**
     * Representa el estado de la tarjeta sea activado o desactivado
     */
    boolean activated;
    
    /**
     * Crea una instancia  de la clase BankAccount
     * @param accountNumber representa el numero de la cuenta de banco
     */
    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /**
     * Activa la cuenta de banco y arroja un mensaje de activacion 
     */
    protected void setActivated() {
        this.activated = true;
        System.out.println("La cuenta se esta activando");
    }
     /**
      *Desactiva la cuenta de banco y arroja un mensaje de Desactivacion  
      */
     
     protected void setOff(){
     this.activated=false;
     System.out.println("La cuenta se esta desactivando");
     }
     /**
      *Muestra el estado de la cuenta de banco
      */
     protected void getAccountstatus(){
     System.out.println("La cuenta "+accountNumber);    
     if(activated==true){
     System.out.println("Esta activada\n");
     
     }else{
     System.out.println("Esta desactivando\n");
    
     }
    
    
}

    
}
