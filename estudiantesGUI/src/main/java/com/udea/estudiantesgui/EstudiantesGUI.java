package com.udea.estudiantesgui;

import controlador.controlador;

public class EstudiantesGUI {

    public static void main(String[] args) {
        //Llamar al controlador desde donde se ejcutan todas las acciones
        //Crear un objeto de tipo controlador donde me deje ver lo que estoy haciendo
        controlador control = new controlador();
        control.iniciar();
        
    }
}
