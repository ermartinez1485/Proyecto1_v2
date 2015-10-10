/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.util.Date;

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
        this.anno = anno;
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
    
    
    
    
}
