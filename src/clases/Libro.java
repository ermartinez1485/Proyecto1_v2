/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Libro {

    public Integer codigo;
    public String nombre;
    public String autor;
    public Date anno;
    public Double precio;

    public Libro() {
    }

    public Libro(Integer codigo, String nombre, String autor, Date anno, Double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.anno = new Date();
        this.precio = precio;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAnno() {
        return anno;
    }

    public void setAnno(Date anno) {
        this.anno = anno;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void capturaDatos() {
        boolean bError = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el codigo del Libro:");

        do {
            try {
                this.codigo = teclado.nextInt();
                bError = false;
            } catch (InputMismatchException ex) {
                System.out.println("Escriba un numero valido para el codigo del libro EJ: 40554 ");
                teclado.next();
                bError = true;
            }
        } while (bError);

        teclado.skip("\n");
        System.out.println("Digite el nombre del Libro:");
        this.nombre = teclado.nextLine();
        System.out.println("Digite el nombre del Autor:");
        this.autor = teclado.nextLine();
        
        DateFormat format = new SimpleDateFormat("dd/MM/yy");
        System.out.println("Ingrese la fecha del libro usando el siguiente formato dd/MM/yy ");
        System.out.println("por ejemplo, la fecha actual: " + format.format(new Date()));
        this.anno = null;
        while (this.anno == null) {
            String line = teclado.nextLine();
            try {
                this.anno = format.parse(line);
            } catch (ParseException e) {
                System.out.println("Formato no valido, intetelo nuevamente, EJ: " + format.format(new Date()));
            }
        }

        //System.out.println("El Año del Libro es:" + this.anno);

        System.out.println("Digite el Precio del Libro:");

        do {
            try {
                this.precio = teclado.nextDouble();
                bError = false;
            } catch (InputMismatchException ex) {
                System.out.println("Escriba un numero valido para el precio del libro EJ: 20.00 ");
                teclado.next();
                bError = true;
            }
        } while (bError);

        teclado.skip("\n");
    }

    public Integer capturaCodigo() {
        int cod = 0;
        boolean bError = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el codigo del Libro:");
        do {
            try {
                cod = teclado.nextInt();
                bError = false;
            } catch (NumberFormatException  ex) {
                System.out.println("error" + ex);
                System.out.println("Escriba un numero valido para el codigo del libro EJ: 40554 ");
                teclado.next();
                bError = true;
            }
        } while (bError);
        teclado.skip("\n");
        return cod;
    }
}