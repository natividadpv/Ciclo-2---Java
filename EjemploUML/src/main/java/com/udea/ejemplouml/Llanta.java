package com.udea.ejemplouml;

public class Llanta {
    private int presion;
    
    public Llanta(){
        this.presion = 0;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }
    
    
    public int inflar(int cant){
        System.out.println("Llanta se esta inflando con +"+cant);
        this.setPresion(this.getPresion() + cant);
        return this.getPresion();
    }
}

