/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.holamundo;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int suma=13;//variable suma definida como integer/entero
        float suma_=10.5f;
        System.out.println(suma);
        short valor_pequeno=5;
        int resultado=suma+valor_pequeno;
        System.out.println("El Resultado es: "+resultado);
        resultado=suma-valor_pequeno;
        System.out.println(resultado);
        resultado=suma/valor_pequeno;
        System.out.println(resultado);
        float resultado_decimal=suma_/valor_pequeno;
        System.out.println(resultado_decimal);
        resultado=suma%2; //la división de 13%2 es impar. % Definir si es par o impar
        System.out.println(resultado);
        resultado=suma*valor_pequeno;
        System.out.println(resultado);
        
        //Operaciones lógicos
        //>, >=, <=, <, ==, !=
        
        //Conectores lógicos
        
        //&& AND
        //|| OR
        
        int n=6;
        //rango1-10
        boolean ismayor=n >=1;
        boolean ismenor=n <=10;
        
        System.out.println("Es mayor que 1?: "+ismayor);
        System.out.println("Es menor que 10?: "+ismenor);

        boolean resultadoAnd=ismayor && ismenor;
        
        System.out.println("Esta en el rango de 1 a 10?: " +resultadoAnd);
        System.out.println("Esta en el rango de 1 a 10?: " + (n>=1 && n<=10));
        
        //if (n>=1 && n<=10) ESTA ES UNA OPCION
        if (resultadoAnd) 
        {
            System.out.println("Estoy dentro del rango del 1 al 10: "+ n);
        }
        else if (n>10 && n<=20)
        {
            System.out.println("Estoy dentro del rango del 11 al 20: "+ n);        
        }
        else
        {
            System.out.println("No estoy en ningun rango: "+ n); 
        }
        while(n<=10){
            if(n == 5){}
            else{
                int multiplicacion = n*10;
                System.out.println("Multiplicación de "+ n +" x 10 = "+ multiplicacion);
            }
            n ++;
        }

        }
        
        }
}
