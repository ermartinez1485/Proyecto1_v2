/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Profesor extends Persona{
    
    protected Double salario;
    protected String escuela;
    
    public Profesor(){
    
        super();
    }

    public Profesor(Double salario, String escuela) {
        this.salario = salario;
        this.escuela = escuela;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    
    
    public void capturaDatos(){
         Scanner teclado = new Scanner(System.in);
         System.out.println("Digite el nombre del Profesor:");
         this.nombre = teclado.nextLine();
         System.out.println("Digite la cedula del Profesor:");
         this.cedula = teclado.nextInt();
         teclado.skip("\n");
         System.out.println("Digite el Salario del Profesor:");
         this.salario = teclado.nextDouble();
         System.out.println("Digite la Escuela del Profesor");
         this.escuela = teclado.nextLine();
         teclado.skip("\n");        
    }
    
    
}
