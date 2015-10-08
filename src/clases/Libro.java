/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.util.Date;
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
    
    public void capturaDatos(){
        
         Scanner teclado = new Scanner(System.in);
         System.out.println("Digite el codigo del Libro:");
         this.codigo = teclado.nextInt();
         teclado.skip("\n");
         System.out.println("Digite el nombre del Libro:");
         this.nombre = teclado.nextLine();
         System.out.println("Digite el nombre del Autor:");
         this.autor = teclado.nextLine();         
         System.out.println("El Año del Libro es:" + this.anno);  
         
         System.out.println("Digite el Precio del Libro:");
         this.precio = teclado.nextDouble();
         teclado.skip("\n");
         
    }
    
    
}
