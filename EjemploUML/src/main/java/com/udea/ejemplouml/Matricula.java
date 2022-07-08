
package com.udea.ejemplouml;

public class Matricula {

    private String id;
    private Carro carro;

//CONSTRUCTOR que se llama igual a la clase, es por quien se parte para construir el objeto    
    public Matricula(String id, Carro carro) {
        this.id = id;
        this.carro = carro;
    }
    
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   
    
    
    
}
