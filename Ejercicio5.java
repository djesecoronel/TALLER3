/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg3;

/**
 *
 * @author DAVID
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        String enunciados[] = {"Comuna", "Candidato A", "Candidato B", "Candidato C", "Candidato D"};
        int votacion[][] = {{1, 2, 3, 4, 5}, {194, 180, 221, 432, 820}, {48, 20, 90, 50, 61}, {206, 320, 140, 821, 946}, {45, 16, 20, 14, 18}};
        
        int totvotos[] = new int[5];
        String mayv = "", ganvotos = "";
        int contador = 0, mayor = 0, comuna=0;
        double porce, votos = 0, mayporce = 0;
        int totcomuna[] = new int[5];
        double maycomuna=0, porcecom;

        for (int i = 0; i <= enunciados.length - 1; i++) {
            System.out.print(enunciados[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int m = 0; m < 5; m++) {
                System.out.print(votacion[m][i] + "\t      ");
            }
            System.out.println("");
        }

       

        for (int i = 1; i < 5; i++) {
            for (int m = 0; m < 5; m++) {
                totvotos[contador] += votacion[i][m];
            }
            votos += totvotos[contador];
            contador++;
        }
        contador = 0;
        
       
        
        for (int i = 0; i < 5; i++) {
            for (int m = 1; m < 5; m++) {
                totcomuna[contador] += votacion[m][i];
            }
            porcecom = (totcomuna[contador] * 100) / votos;
            if (porcecom > maycomuna) {
                maycomuna = porcecom;
                comuna = i+1;
            }
            contador++;
        }
        contador = 0;
        
        
        for (int j = 1; j < 5; j++) {

            porce = (totvotos[contador] * 100) / votos;
            System.out.printf("El " + enunciados[j] + " tiene " + totvotos[contador] + " votos en total con un porcentaje del %.2f \n", porce);
            
            if (totvotos[contador] > mayor) {
                mayor = totvotos[contador];
                mayv = enunciados[j];
            }
            
            if (porce > mayporce) {
                mayporce = porce;
                ganvotos = enunciados[j];
            }
            contador++;
        }
        
        System.out.println("EL " + mayv + " CON " + mayor + " VOTOS FUE EL MAYOR CANTIDAD TUVO");
        System.out.printf("EL " + ganvotos + " FUE EL GANADOR CON EL %.2f % DE LOS VOTOS\n", mayporce);
        System.out.printf("LA COMUNA "+ comuna +" CON EL  %.2f PORCIENTO ES LA QUE MAYOR PORCENTAJE DE VOTOS TIENE\n",maycomuna);

    }
}
