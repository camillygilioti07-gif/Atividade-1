/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_aula;

import java.util.Scanner;
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] entrada = new int[15];
        int[] distintos = new int[15];
        int qtdDistintos = 0;

        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < 15; i++) {
            entrada[i] = ler.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            boolean jaExiste = false;
            for (int j = 0; j < qtdDistintos; j++) {
                if (entrada[i] == distintos[j]) {
                    jaExiste = true;
                    break;
                }
            }
            if (!jaExiste) {
                distintos[qtdDistintos] = entrada[i];
                qtdDistintos++;
            }
        }

        System.out.print("Valores distintos: ");
        for (int i = 0; i < qtdDistintos; i++) {
            System.out.print(distintos[i] + " ");
        }
        System.out.println("\nQuantidade de valores diferentes: " + qtdDistintos);


    }
}
