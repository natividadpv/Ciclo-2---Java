package modelo;

import java.io.Serializable;

/*SERIALIZAR: Crear para un objeto, bloques de información, sin importar
    sus valores y variables para ser más eficaz y sin importar cómo la mueva*/

public class modelo implements Serializable {
    //Lo que va a tener mi Estudiante
    //Como es grafico, se va a trabajar con Strings porque no se va a operar con ninguno de ellos
    //Como se va a manejar como si fuese un objeto independiente, se crean atributos private
    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String programa;
    
    //Contructor: Para crear un objeto modelo, se necesita(...)
    public modelo(String id, String nombre, String apellido, String telefono, String correo, String programa) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.programa = programa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
   
  
    
}
