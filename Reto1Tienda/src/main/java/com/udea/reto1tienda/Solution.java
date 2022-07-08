
package com.udea.reto1tienda;

public class Solution {
    
        public static int [] reporte(int[]compra){
        int min = compra[0];
        
        for(int i=0;i<compra.length;i++){
            if(compra[i]<min){
              min=compra[i];
              }
        }
        
        int max = compra[0];
        for(int i=0;i<compra.length;i++){
            if(compra[i]>max){
              max=compra[i];
            }
        }
        
        int total= 0;
        for (int i=0;i<compra.length;i++){
            total=total+compra[i];
            }
        int[] ArrayList =new int[3];
        ArrayList[0]=total;
        ArrayList[1]=min;
        ArrayList[2]=max;
        
        return ArrayList;
        
        }
}

