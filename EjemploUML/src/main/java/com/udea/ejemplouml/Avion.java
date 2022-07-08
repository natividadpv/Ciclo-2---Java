
package com.udea.ejemplouml;

public class Avion extends Vehiculo {
 
    private double altitud;

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }
    
    public double ascender (){
        System.out.println("Altitud ascender + 0.5");
        this.setAltitud(this.getAltitud()+0.5);
        return this.getAltitud();
    }
    public double descender (){
        if (this.getAltitud()>0){
            this.setAltitud(0);
        }
        else{
        this.setAltitud(this.getAltitud()-0.5);
        }
    }
    return this.Avion();
}
        
