/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Enrico
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String str = n.nextLine();
        int i = Integer.parseInt(str);
        int soma = 0;
        for (int x=0; x<i;x++) {
        if ((x % 3) == 0) { 
            soma += x;   
            System.out.println(x);
        }
            
             }
    System.out.println(soma);
            }
    
    }
