/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author alxdr
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int n[] = new int [4];
        int n[] = {3,2,8,7,5,4};
        //System.out.println("Total de casas de N: " + n.length + ".");
        Arrays.sort(n);
        for (int c=0; c<n.length; c++){
            System.out.println("Na posicao " + c + ", temos o valor " + n[c] + ".");
        }
    }
    
}
