/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;
//import java.util.ArrayList;
/**
 *
 * @author gasto
 */
public class Hotel {
    private int cantHabitaciones;
    Habitacion[] habitaciones;
    
    //constructor
    public Hotel(int cant){
        cantHabitaciones = cant;
        habitaciones = new Habitacion[cant];
        
        for(int i = 0; i < cantHabitaciones; i++){
            Habitacion h = new Habitacion();
            habitaciones[i] = h;
        }
    }
    
    public String agregarCliente(int unaHabitacion, Persona unCliente){
        String aux;
        if(!habitaciones[unaHabitacion].estaOcupada()){
             habitaciones[unaHabitacion].setCliente(unCliente);
             habitaciones[unaHabitacion].cambiarEstado();
             aux = "cliente agregado";
        }else{
            aux = "no se puede agregar";
        }
        return aux;
    }
    
    public String toString(int numero){
        String aux;
        aux = "Habitacion: "+ numero+ habitaciones[numero].toString();
        return aux;
    }
}
