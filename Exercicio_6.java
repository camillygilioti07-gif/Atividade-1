/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_aula;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] m = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = ler.nextInt();
            }
        }

        boolean eMagica = true;

        
        boolean[] presente = new boolean[10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int val = m[i][j];
                if (val < 1 || val > 9 || presente[val]) {
                    eMagica = false;
                } else {
                    presente[val] = true;
                }
            }
        }

        if (!eMagica) {
            System.out.println("- Não contém todos os números de 1 a 9 sem repetição.");
        }

       
        int somaAlvo = m[0][0] + m[0][1] + m[0][2];

        
        boolean linhasIguais = true;
        for (int i = 0; i < 3; i++) {
            int somaLinha = m[i][0] + m[i][1] + m[i][2];
            if (somaLinha != somaAlvo) {
                linhasIguais = false;
            }
        }
        if (!linhasIguais) {
            eMagica = false;
            System.out.println("- Nem todas as linhas possuem a mesma soma.");
        }

      
        boolean colunasIguais = true;
        for (int j = 0; j < 3; j++) {
            int somaColuna = m[0][j] + m[1][j] + m[2][j];
            if (somaColuna != somaAlvo) {
                colunasIguais = false;
            }
        }
        if (!colunasIguais) {
            eMagica = false;
            System.out.println("- Nem todas as colunas possuem a mesma soma.");
        }

        int somaDiag1 = m[0][0] + m[1][1] + m[2][2];
        int somaDiag2 = m[0][2] + m[1][1] + m[2][0];
        if (somaDiag1 != somaAlvo || somaDiag2 != somaAlvo) {
            eMagica = false;
            System.out.println("- As diagonais não possuem a mesma soma das linhas/colunas.");
        }

        if (eMagica) {
            System.out.println("A matriz É MÁGICA!");
        } else {
            System.out.println("A matriz NÃO é mágica.");
        }
        
    }

}

