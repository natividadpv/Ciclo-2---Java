
package com.mycompany.holamundo2;

import java.util.Scanner;

public class HolaMundo2 {

    public static void main(String[] args) { //main es el punto de partida, es indispensable. void = no retorna nada
        String nombre; //Creamos la variable que me va a guardar mi nombre
        Scanner input=new Scanner (System.in); //Creamos un objeto tipo Scanner 
        System.out.println("¿Cual es tu nombre?");
        nombre=input.nextLine(); //nombre será lo que ingresemos en la siguiente linea durante la ejecucion
        System.out.println("Hola " +nombre+ ", cómo estas?");
    }
}
