/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg3;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Ejercicio1 {
public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int n, totprodu=0, totin=0, vendido=0, masven = 0, costoso=0, mascos =0;
        
        System.out.print("¿Productos del inventario vendidos hoy?: ");
        n = entrada.nextInt();
        
        int[] code = new int[n];
        int[] val = new int[n];
        int[] cantven = new int[n];
        
        for(int i = 0; i <= n -1; i++ ){

            
            System.out.print("\nDigite el codigo del producto # " +(i+1)+" : ");
            code[i] = entrada.nextInt();
            
            System.out.print("Ingrese el valor del producto # " +(i+1)+" : ");
            val[i] = entrada.nextInt();
            
            System.out.print("Que cantidad se vendio del producto # " +(i+1)+" : ");
            cantven[i] = entrada.nextInt();
            
            totprodu += cantven[i];
            totin += (val[i]*cantven[i]);
            
            if(cantven[i] > vendido){
                vendido = cantven[i];
                masven = code[i];
            }
            
            if(val[i] > costoso){
                costoso = val[i];
                mascos = code[i];
            }
            
        }
        
        System.out.println("\nCANTIDAD TOTAL DE PRODUCTOS VENDIDOS: "+totprodu);
        System.out.println("TOTAL INGRESOS OBTENIDOS EN EL DIA: "+ totin);
        System.out.println("CODIGO DEL PRODUCTO QUE MAS SE VENDIO: "+masven);
        System.out.println("CODIGO DEL PRODUCTO MAS CARO VENDIDO: "+mascos);
    }
}
           
