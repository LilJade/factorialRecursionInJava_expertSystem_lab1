/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numfactorial_recursioninjava;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class NumFactorial_RecursionInJava {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa tu numero: ");
        int n = sc.nextInt();
        
        System.out.println("Numero factorial de " + n + ": " + calcularFactorial_Recursividad(n));
    }
    
    static int calcularFactorial_Recursividad(int n) {
        if (n <= 1) {
            return 1;
        }
        
        return n * calcularFactorial_Recursividad(n - 1);
    }
    
}
