
package com.udea.reto3partido;

//NO ELIMINAR ESTA IMPORTACIÓN. SE REQUIERE
//PARA LA EJECUCIÓN DEL MÉTODO 
//generarCredencialesPrevia()
import java.util.Random;

public class VIP extends Asistente{
    
    //ESPACIO PARA INDICAR LOS ATRIBUTOS DE LA CLASE
    //Y SU MÉTODO CONSTRUCTOR
    
    //NO DEBE PREOCUPARSE POR LA ESCRITURA DEL
    //MÉTODO A CONTINUACIÓN. ESTE REQUIERE DE LA 
    //IMPORTACIÓN DE LA LIBRERÍA Random PARA SU 
    //FUNCIONAMIENTO
    public void generarCredencialesPrevia() {
        if(credencialesPrevia.isEmpty()){
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencialPrevia = String.valueOf(x);
            credencialesPrevia = credencialPrevia;
        }
    }
    
    public void asignarPantalla(int pantalla){
        
        //ESPACIO PARA ESCRIBIR LA LÓGICA DEL MÉTODO
        //asignarPantalla()
        
    }

    //ESPACIO PARA INDICAR LOS MÉTODOS GETTER Y
    //SETTER DEL CASO

}
