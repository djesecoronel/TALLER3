/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg3;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author DAVID
 */
public class Ejercicio3 {
     public static void main(String[] args) {
         int incentivo=0, valordia, totalven = 0; 
         double porcenbruto=0.00, incrementota = 0.00, incrementotb = 0.00, ingresostotA, ingresostotB, incentivo1, incentivo2, incentivo3, incentivo4, incentivototalb = 0, incentivototala = 0;
        
         
         incentivo = 200;
         incentivo1 = totalven * 0.5;
         incentivo2 = totalven * 0.7;
         incentivo3 = totalven * 0.10;
         incentivo4 = totalven * 0.13;
                 
        int[] ventas = new int [7];
  
                
        for(int i = 0; i <= 6 ; i++){
           ventas[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el total vendido el dia " + (i + 1)));
            totalven = totalven+ventas[i];
        }
        
         if (totalven > 3000){
             incrementota = incentivo1;
             if(totalven >= 5000){
                incrementota = incentivo2;
                if(totalven > 7000){
                    incrementota = incentivo3;
                   }    
                 }
               }
         
         incentivototala += incrementota;
         
         if(totalven > 5000){
         incrementotb = incentivo2;
            if(totalven >= 10000 ){
            incrementotb = incentivo3;
                if(totalven > 15000){
                incrementotb = incentivo4; 
                }
               }
              }
         incentivototalb += incrementotb;
         
         porcenbruto = totalven * 0.9;
         ingresostotA = totalven + incentivototala + incentivo + porcenbruto;
         ingresostotB = totalven + incentivototalb + incentivo + porcenbruto;
         
         JOptionPane.showMessageDialog(null, "El pago semanal total en la categoria A es de: "+ingresostotA);
         JOptionPane.showMessageDialog(null, "El pago semanal total en la categoria B es de: "+ingresostotB);
         
     }
}