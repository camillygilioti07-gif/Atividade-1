/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios_aula;


import java.util.Scanner;


public class Exercicios_Aula {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        double[]notas = new double [10];
        double soma = 0;
       
       System.out.println("Digite as notas dos 10 alunos:");
         for (int i = 0; i < 10; i++){
             System.out.print("Aluno"+(i+1) + ":");
              notas[i] = ler.nextDouble();
              soma += notas[i];
         }
         double media = soma/10;
         double maior = notas[0];
         double menor = notas[0];
         int acimaOuIgualSete = 0;
         int abaixoDaMedia = 0;
         
         for (int i = 0; i < 10; i++){
            if (notas[i] > maior)
                maior = notas [i];
            if (notas[i] < menor)
                menor = notas[i];
            if (notas[i] >= 7.0)
                acimaOuIgualSete++;
            if (notas[i] < media)
                abaixoDaMedia++;
    }
         System.out.printf("\nMedia da turma: %2f\n", media);
         System.out.println("Maior nota:" + maior);
         System.out.println("Menor nota:" + menor);
         System.out.println("Alunos com nota >= 7:" + acimaOuIgualSete);
         System.out.println("Alunos abaixo da media:" + abaixoDaMedia);
         
            
    }
}
