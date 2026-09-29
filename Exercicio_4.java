
package com.mycompany.exercicios_aula;

import java.util.Scanner;
public class Exercicio_4 {
      public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 5;
        int[][] original = new int[n][n];
        int[][] rotacionada = new int[n][n];

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                original[i][j] = ler.nextInt();
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotacionada[j][n - 1 - i] = original[i][j];
            }
        }

        System.out.println("\nMatriz Original:");
        imprimirMatriz(original, n);

        System.out.println("\nMatriz Rotacionada (90° Horário):");
        imprimirMatriz(rotacionada, n);

    }

    public static void imprimirMatriz(int[][] m, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

    

