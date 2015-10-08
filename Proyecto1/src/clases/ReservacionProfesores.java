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
public class ReservacionProfesores {
    
    public Profesor profesor;
    public Libro libro;
    public Integer diasDePrestamo;
    public Date fechaReservacion;

    public ReservacionProfesores() {
    }

    public ReservacionProfesores(Profesor profesor, Libro libro, Integer diasDePrestamo, Date fechaReservacion) {
        this.profesor = profesor;
        this.libro = libro;
        this.diasDePrestamo = diasDePrestamo;
        this.fechaReservacion = fechaReservacion;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Integer getDiasDePrestamo() {
        return diasDePrestamo;
    }

    public void setDiasDePrestamo(Integer diasDePrestamo) {
        this.diasDePrestamo = diasDePrestamo;
    }

    public Date getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(Date fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }
    
    
    
    
    
}
