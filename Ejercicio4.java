/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg3;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio4 {
    static String[]A;
    static int[]N;
    static int[]U;
    
    static int n;
    
    static void calcularSueldo(int H[],int T[],String  E[]){
        double Sueldo;
        for (int i=0; i<E.length; i++){
            if(H[i]<=40){
                Sueldo=H[i]*T[i];
            }
            else{
                Sueldo=(40*T[i])+(H[i]-40)*(T[i]*1.5);
                

            }
            System.out.println("El sueldo del empleado " +E[i] +" es: " +Sueldo);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner lector= new Scanner (System.in);
        System.out.println("Cuantos empleados son: ");
        n = lector.nextInt();
        A= new String[n];
        N= new int[n];
        U= new int[n];
         
        for (int i=0; i<A.length; i++){
            System.out.println("\nDigite el nombre del empleado # " +(i+1) );
            A[i]=lector.next();
                    
            
            System.out.println("Cuantas horas trabajo el empleado # " +(i+1) );
            N[i]=lector.nextInt();
            
            System.out.println("Ingrese la TARIFAxHORA del empleado # " +(i+1));
            U[i]=lector.nextInt();
            
           calcularSueldo(N,U,A);
           
        }
}
}

