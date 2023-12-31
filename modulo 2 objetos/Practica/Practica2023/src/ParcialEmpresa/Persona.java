/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcialEmpresa;

/**
 *
 * @author gasto
 */
public abstract class Persona {
    private String nombre;
    private int Ingreso;
    private int dni;
    private double sueldoBasico;
    
    //constructores
    public Persona(String unNombre,int unAnio,int unDni, double unSueldo){
        setNombre(unNombre);
        setIngreso(unAnio);
        setDni(unDni);
        setSueldoBasico(unSueldo);
    } 
    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIngreso() {
        return Ingreso;
    }

    public void setIngreso(int Ingreso) {
        this.Ingreso = Ingreso;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    public boolean antiguedad(){
        return 20 <= 2023 - getIngreso();
    }
    
    public double plusSueldo(){
        double aux;
        if(antiguedad()){
            aux = getSueldoBasico() *0.10;
        }else{
            aux = getSueldoBasico();
        }
        return aux;
    }
    
    @Override
    public String toString(){
        String aux;
        aux = " Nombre: "+getNombre()+" Dni: "+getDni();
        return aux;
    }
    
    public abstract double sueldo();
    
}
