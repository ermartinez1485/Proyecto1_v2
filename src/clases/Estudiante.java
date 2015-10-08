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
public class Estudiante extends Persona{
    
    protected String carrera;
    protected Integer carnet;

    public Estudiante() {
        super();
    }

    public Estudiante(String carrera, Integer carnet) {
        this.carrera = carrera;
        this.carnet = carnet;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getCarnet() {
        return carnet;
    }

    public void setCarnet(Integer carnet) {
        this.carnet = carnet;
    }
    
    public void capturaDatos(){
         Scanner teclado = new Scanner(System.in);
         System.out.println("Digite el nombre del Estudiante:");
         this.nombre = teclado.nextLine();
         System.out.println("Digite la cedula del Estudiante:");
         this.cedula = teclado.nextInt();
         teclado.skip("\n");
         System.out.println("Digite la carrera:");
         this.carrera = teclado.nextLine();
         System.out.println("Digite el numero de carnet");
         this.carnet = teclado.nextInt();
         teclado.skip("\n");        
    }
    

}
