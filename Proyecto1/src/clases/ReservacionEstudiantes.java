/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.util.Date;

/**
 *        return estudiante;
    }

 * @author Casa
 */
public class ReservacionEstudiantes {
    
    public Estudiante estudiante;
    public Libro libro;
    public Integer diasDePrestamo;
    public Date fechaReservacion;
    
    public ReservacionEstudiantes() {
    }

    public ReservacionEstudiantes(Estudiante estudiante, Libro libro, Integer diasDePrestamo, Date fechaReservacion) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.diasDePrestamo = diasDePrestamo;
        this.fechaReservacion = fechaReservacion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
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
