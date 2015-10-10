/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Estudiante extends Persona {

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

    public void capturaDatos() {

        boolean bError = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el nombre del Estudiante:");
        this.nombre = teclado.nextLine();
        System.out.println("Digite la cedula del Estudiante:");
        do {
            try {
                this.cedula = teclado.nextInt();
                bError = false;
            } catch (InputMismatchException ex) {
                System.out.println("Escriba un numero valido para la cedula EJ: 112700030 ");
                teclado.next();
                bError = true;
            }
        } while (bError);
        teclado.skip("\n");
        System.out.println("Digite la carrera:");
        this.carrera = teclado.nextLine();
        System.out.println("Digite el numero de carnet");

        do {
            try {
                this.carnet = teclado.nextInt();
                bError = false;
            } catch (InputMismatchException ex) {
                System.out.println("Escriba un numero valido para el carnet EJ: 12254 ");
                teclado.next();
                bError = true;
            }
        } while (bError);
        teclado.skip("\n");
    }

    public Integer capturaCedula() {
        boolean bError = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite la cedula del Estudiante:");

        do {
            try {
                this.cedula = teclado.nextInt();
                bError = false;
            } catch (InputMismatchException ex) {
                System.out.println("Escriba un numero valido para la cedula EJ: 112700030 ");
                teclado.next();
                bError = true;
            }
        } while (bError);

        teclado.skip("\n");
        return this.cedula;
    }
}
