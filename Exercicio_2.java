/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_aula;

import java.util.Scanner;
        
public class Exercicio_2 {   
     public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        System.out.print("Diagonal Principal: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
            somaPrincipal += matriz[i][i];
        }

        System.out.print("\nDiagonal Secundária: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][3 - i] + " ");
            somaSecundaria += matriz[i][3 - i];
        }

        System.out.println("\n\nSoma Diagonal Principal: " + somaPrincipal);
        System.out.println("Soma Diagonal Secundária: " + somaSecundaria);

        if (somaPrincipal > somaSecundaria) {
            System.out.println("A Diagonal Principal possui a maior soma.");
        } else if (somaSecundaria > somaPrincipal) {
            System.out.println("A Diagonal Secundária possui a maior soma.");
        } else {
            System.out.println("As duas somas são iguais.");
        }
    }
}


    


