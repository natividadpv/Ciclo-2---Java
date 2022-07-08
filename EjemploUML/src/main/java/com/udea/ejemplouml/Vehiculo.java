package com.udea.ejemplouml;

public abstract class Vehiculo {
   
    protected float velocidad;
        
    public float getVelocidad(){
        return velocidad;
    }
    
    public void setVelocidad (float velocidad){
        this.velocidad = velocidad;
       
    }
    
    public float acelerar (float aceleracion){
        System.out.println("Voy a acelerar en + " +aceleracion);
        this.setVelocidad(this.getVelocidad()+aceleracion);
        
        return this.getVelocidad();
    
    }
    
    public float frenar(float freno){
        
        if (this.getVelocidad()>0){
            //validacion para que el resultado no sea negativo
          //si  (la velocidad menos el freno)es < 0
            if (this.getVelocidad()-freno<0){
              //ponga la velocidad en 0
                this.setVelocidad(0);//Tambien se puede: this.velocidad=0
            }
            else{
                this.setVelocidad(this.getVelocidad()-freno);
            }
        }
        return this.getVelocidad();
    }
    
}
