package com.udea.reto1ciclo1;
//3. Se debe importar la libreria para crear un input
import java.util.Scanner;
        //int n=6; //número ganador
        //int b=20; //limite de participantes
public class Reto1Ciclo1 {
    //Dentro de main se debe llamar el método
    public static void main(String[] args) {
        rifa(5,20);
    }
    
    //Asi se define una función ó método
    public static void rifa(int n, int b){//los argumentos del método se deben tipar
        //3. Declaro objeto para input tipo scanner
        Scanner input=new Scanner(System.in);
        //1. declaro variables, luego se deben borrar: int n=6, int b=20
        int intentos=0;//1. Declarar el contador para saber cuantos intentos llevo
        
        //2. MIENTRAS no se adivine el numero, se va a seguir pidiendo hasta que elija el ganador
        while (true){
           System.out.println("Por favor ingrese un número: ");
           //4. Guardamos el numero ingresado en la variable numero
           int numero=input.nextInt();
           //5. Verificamos si el número está por fuera del intervalo
           if (numero<0 || numero>b){// ||=or y &&=and
                System.out.println("¡Te saliste del intervalo!");
           }
           //6. verificamos si se paso del intervalo
           else if (numero>n){
                System.out.println("Ups! Te pasaste");
                intentos=intentos+1;//7. Vamos quemando intentos
           }
           //8. verificamos si se paso del intervalo
           else if(numero<n){
                System.out.println("Ups! Estas por debajo");
                intentos=intentos+1;//9. Vamos quemando intentos
           }
           //10. verificamos si es el mismo número
           else if (numero==n){
                intentos=intentos+1;
                System.out.println("!LO LOGRASTE! Usaste " + intentos + " intentos"); 
                break;//11. rompemos el ciclo while
           }
        }
}
}
