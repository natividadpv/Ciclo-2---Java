package com.udea.ejemplouml;

import java.util.ArrayList;



//para llamar atributos de otra clase
//                extender/heredar todo lo publico y protegido de vehiculo
public class Carro extends Vehiculo {
    
    private String placa;
    private String modelo;
    private boolean puerta;
    private ArrayList Llantas;
    private Matricula matricula;



    public Carro(String placa, String modelo, boolean puerta) {
        this.placa = placa;
        this.modelo = modelo;
        this.puerta = puerta;
        this.llantas= llantas;
        this.matricula = new matricula ("1234", this); //this hace referencia al objeto que se crea
    }

        public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
    
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isPuerta() {
        return puerta;
    }

    public void setPuerta(boolean puerta) {
        this.puerta = puerta;
    }
            
    public void bloquear(){
        if (this.velocidad == 0){
            this.puerta = true;
        }
        else{
        this.puerta = false;
        
        }
    
    }

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", modelo=" + modelo + ", puerta=" + puerta + ", Llantas=" + Llantas + ", matricula=" + matricula + '}';
    }
   
    
    
}
