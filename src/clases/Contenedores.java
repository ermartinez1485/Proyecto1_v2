/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author Eric Martinez Solis
 */
public class Contenedores {

    Estudiante[] listaEstudiante;
    Profesor[] listaProfesor;
    Libro[] listaLibros;
    ReservacionEstudiantes[] listaReservaEstu;
    ReservacionProfesores[] listaReservaProfe;

    public Contenedores() {

        this.listaEstudiante = new Estudiante[5];
        this.listaProfesor = new Profesor[5];
        this.listaLibros = new Libro[10];
        this.listaReservaEstu = new ReservacionEstudiantes[10];
        this.listaReservaProfe = new ReservacionProfesores[10];

    }

    public boolean agregaEstudiante(Estudiante estu) {
        for (int i = 0; i < this.listaEstudiante.length; i++) {
            if (this.listaEstudiante[i] == null) {
                this.listaEstudiante[i] = estu;
                return true;
            }
        }
        return false;
    }

    public boolean agregaProfesor(Profesor profe) {
        for (int i = 0; i < this.listaProfesor.length; i++) {
            if (this.listaProfesor[i] == null) {
                this.listaProfesor[i] = profe;
                return true;
            }
        }
        return false;
    }

    public boolean agregaLibro(Libro libro) {
        for (int i = 0; i < this.listaLibros.length; i++) {
            if (this.listaLibros[i] == null) {
                this.listaLibros[i] = libro;
                return true;
            }
        }
        return false;
    }

    public boolean reservarEstudiante(Estudiante estu, Libro libro) {

        ReservacionEstudiantes reserv = new ReservacionEstudiantes(estu, libro, 0, new Date());

        for (int i = 0; i < this.listaReservaEstu.length; i++) {
            if (this.listaReservaEstu[i] == null) {
                this.listaReservaEstu[i] = reserv;
                return true;
            }
        }
        return false;
    }

    public boolean reservarProfesor(Profesor profe, Libro libro) {

        ReservacionProfesores reserv = new ReservacionProfesores(profe, libro, 0, new Date());

        for (int i = 0; i < this.listaReservaProfe.length; i++) {
            if (this.listaReservaProfe[i] == null) {
                this.listaReservaProfe[i] = reserv;
                return true;
            }
        }
        return false;
    }

    public Estudiante buscarEstudiante(int ced) {
        for (int i = 0; i < this.listaEstudiante.length; i++) {
            Estudiante reg = this.listaEstudiante[i];
            if (reg != null) {
                if (reg.getCedula() == ced) {
                    return reg;
                }
            } 
        }
        return null;
    }

    public Profesor buscarProfesor(int ced) {
        for (int i = 0; i < this.listaProfesor.length; i++) {
            Profesor reg = this.listaProfesor[i];
            if (reg != null) {
                if (reg.getCedula() == ced) {
                    return reg;
                }
            } 
        }
        return null;
    }

    public Libro buscarLibro(int cod) {
        for (int i = 0; i < this.listaLibros.length; i++) {
            Libro reg = this.listaLibros[i];
            if (reg != null) {
                if (reg.getCodigo() == cod) {
                    return reg;
                }
            } 
        }
        return null;
    }

    public ReservacionEstudiantes[] getListaReservaEstu() {
        return listaReservaEstu;
    }

    public ReservacionProfesores[] getListaReservaProfe() {
        return listaReservaProfe;
    }

    public Estudiante[] getListaEstudiante() {
        return listaEstudiante;
    }

    public void setListaEstudiante(Estudiante[] listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }

    public Profesor[] getListaProfesor() {
        return listaProfesor;
    }

    public void setListaProfesor(Profesor[] listaProfesor) {
        this.listaProfesor = listaProfesor;
    }

    public Libro[] getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(Libro[] listaLibros) {
        this.listaLibros = listaLibros;
    }

    public String getLibroMasPrestado(Libro[] libros) {
        String libroMasPrestado = "";
        int veces[] = new int[libros.length];
        int posicion = 0;
        int index = 0;

        for (int i = 0; i < libros.length; i++) {
            libroMasPrestado = libros[i].getNombre();
            for (int j = 0; j < libros.length; j++) {
                if (libros[j].getNombre().equals(libroMasPrestado)) {
                    veces[i]++;
                }
            }

            for (int k = 0; k < veces.length; k++) {
                if (index < veces[k]) {
                    index = veces[k];
                    posicion = k;
                }
            }
            libroMasPrestado = libros[posicion].getNombre();

        }
        return libroMasPrestado;
    }
}
