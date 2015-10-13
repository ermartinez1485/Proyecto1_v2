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
 * @author Eric Martinez
 */
public class Profesor extends Persona {

    protected Double salario;
    protected String escuela;

    public Profesor() {

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

    public void capturaDatos() {
        boolean bError = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el nombre del Profesor:");
        this.nombre = teclado.nextLine();

        System.out.println("Digite la cedula del Profesor:");
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

         //teclado.skip("\n");
        System.out.println("Digite el Salario del Profesor:");
        do {
            try {
                this.salario = teclado.nextDouble();
                bError = false;
            } catch (InputMismatchException ex) {
                System.out.println("Escriba un numero valido para el salario EJ: 20.30 ");
                teclado.next();
                bError = true;
            }
        } while (bError);

        teclado.skip("\n");
        System.out.println("Digite la Escuela del Profesor");
        this.escuela = teclado.nextLine();
    }

    public Integer capturaCedula() {
        boolean bError = true;
        int ced = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite la cedula del Profesor:");
        do {
            try {
                ced = teclado.nextInt();
                bError = false;
            } catch (InputMismatchException ex) {
                System.out.println("Escriba un numero valido para la cedula EJ: 112700030 ");
                teclado.next();
                bError = true;
            }
        } while (bError);
        teclado.skip("\n");
        return ced;
    }
}
