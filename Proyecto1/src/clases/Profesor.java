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
public class Profesor extends Persona{
    
    protected Double salario;
    protected String escuela;
    
    public Profesor(){
    
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
    
    
    
}
