
package com.udea.reto3partido;

//NO ELIMINAR ESTA IMPORTACIÓN. SE REQUIERE
//PARA LA EJECUCIÓN DEL MÉTODO generarCredenciales()
import java.util.Random;


public class Asistente {
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    //Y SU MÉTODO CONSTRUCTOR

    //NO DEBE PREOCUPARSE POR LA ESCRITURA DEL
    //MÉTODO A CONTINUACIÓN. ESTE REQUIERE DE LA 
    //IMPORTACIÓN DE LA LIBRERÍA Random PARA SU 
    //FUNCIONAMIENTO
    public void generarCredenciales() {
        if(credenciales.isEmpty()){ 
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencial = String.valueOf(x);
            credenciales = credencial;
        }
    }
    
    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y
    //SETTER DEL CASO

 }

