
package modelo;

import java.util.ArrayList;
//Generamos una base de datos que guarde estudiantes, luego que se exporte
public class BaseDeDatos {
    
    //damos atributos a la base de datos
    private ArrayList <modelo> listaEstudiantes;
    
    //Generamos el contructor que como parámetro sea la lista de estudiantes
    //Llamo a clase de datos para que cree un nuevo arraylist para que reciba todos los objetos de tipo modelo
    public BaseDeDatos(){
    this.listaEstudiantes=new ArrayList();//Nueva lista vacia para guardar todos los modelos=estudiante
     
     }
    //Creamos un metodo para guardar los modelos en el ArrayList
    //                          //tipo  //nombre del parametro
    public void guardarEstudiante(modelo estudiante){
        //añade objetos de tipo modelo en la listaEstudiantes
    this.listaEstudiantes.add(estudiante);
        System.out.println("Estudiante guardado en la lista");
     }
    
     public modelo buscarEstudiante(String id){
    modelo result= null; //Por defecto
    for (int i=0; i<this.listaEstudiantes.size();i++){
        if(this.listaEstudiantes.get(i).getId().equals(id)){
            System.out.println("Estudiante encontrado");
            result=this.listaEstudiantes.get(i);
        }
    }
    return result;
    }
     
}    
    
    

   
