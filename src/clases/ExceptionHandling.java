/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Desktop Casa
 */
public class ExceptionHandling {
    
    Integer number;
    String string;
    Double doubleNumber;
    Date date;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Double getDoubleNumber() {
        return doubleNumber;
    }

    public void setDoubleNumber(Double doubleNumber) {
        this.doubleNumber = doubleNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    public Integer numberException(){
        boolean bError = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite la cedula del Estudiante:"); 
        this.string = teclado.nextLine();
        do {
            try {
                this.number = Integer.parseInt(this.string);
                bError = false;
            } catch (InputMismatchException ex) {
                System.out.println("Escriba un numero valido para ");
                teclado.next();
            }
        } while (bError);
        return this.number;
    }
}