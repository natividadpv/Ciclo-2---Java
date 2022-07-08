
package com.udea.reto2peaje;
public class Main {
    public static void main (String[] args){
    
    String [] filaCoches =new String []{
    
    "FINC901", "RBP250", "TPS706", "ITN503",
    "RSP845", "SBL560", "IVD432", "LCS254", 
    "ECT243", "RPL22", "FRS484", "TLB884", 
    "NFT984", "INS230"
    };
    
    Peaje taquillaPeaje=new Peaje(filaCoches);
    
    System.out.println(taquillaPeaje);
    
    taquillaPeaje.proximoCoche();
    
    }
    
    
    
}
