package com.udea.ejemplouml;

import java.util.ArrayList;

public class EjemploUML {

    public static void main(String[] args) {
    //Como Avion y Carro heredan de vehiculo, por lo tanto son de tipo vehiculo
        //Carro_2 es de tipo Carro = el cual contiene los siguientes parámetros (); 
        Carro carro_2 = new Carro ("DFE-456","Mazda",false);
        
        Vehiculo carro_1 = new Carro("ABC-123","Mazda",false);
       
        System.out.println("Velocidad= " + carro_2.getVelocidad());
    
    //CREAR UN OBJETO DINÁMICO    
    //Crear un arreglo de lista    
    ArrayList <String> nombres= new ArrayList <String>();
    
    //añadir elementos a la lista
    nombres.add("Laura");
    nombres.add("Paula");
    nombres.add("Luis");
    nombres.add("Camilo");
    nombres.add("Pablo");
    nombres.add("Antonia");
    
    //Llamar el total de elementos de la lista
        System.out.println(nombres.size());
        
    //Llamar un elemento de X posición en la lista
        System.out.println(nombres.get(2));
        
    //Añadir elementos en X posición de la lista
        nombres.add(1,"Camila");
    
        
    //PARA COMPARAR CARACTERISTICAS DE LOS OBJETOS CON METODO .equals
    
        String nombre_1="Paula";
        String nombre_2="Paula";
        
        System.out.println(nombre_1.equals(nombre_2));
        
    ArrayList <
        
        
        
        
        
        
        
        
        
        
    }
    
}

 