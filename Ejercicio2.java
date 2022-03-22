/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author DAVID
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int saldoin, abonosmes, totdeducciones, limit, nuevosaldo;
       
       limit = Integer.parseInt(JOptionPane.showInputDialog("Digite el limite del credito: "));
       saldoin = Integer.parseInt(JOptionPane.showInputDialog("Digite el saldo inicial:  "));
       abonosmes = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor total de abonos: "));
       totdeducciones = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor total en deducciones: "));
       
      
 
       
        nuevosaldo = saldoin + abonosmes - totdeducciones ;
        
        if(nuevosaldo > limit){
        
            JOptionPane.showMessageDialog(null, "¡SE EXCEDIO EL LIMITE DE SU CREDITO!");
        }
        else{
            
          JOptionPane.showMessageDialog(null, "NO SE EXCEDIO EL LIMITE DE SU CREDITO");  
          
        }
    }
}