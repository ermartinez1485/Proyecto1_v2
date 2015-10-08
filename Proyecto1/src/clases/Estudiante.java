/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

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
    

}
