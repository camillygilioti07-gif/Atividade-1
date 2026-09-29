
package com.mycompany.exercicios_aula;

    import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] original = new int[20];
        int[] ordenado = new int[20];

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            original[i] = ler.nextInt();
            ordenado[i] = original[i];
        }

        int comparacoes = 0;
        int trocas = 0;

       
        for (int i = 0; i < 20 - 1; i++) {
            for (int j = 0; j < 20 - 1 - i; j++) {
                comparacoes++;
                if (ordenado[j] > ordenado[j + 1]) {
                    int temp = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = temp;
                    trocas++;
                }
            }
        }

        double mediana = (ordenado[9] + ordenado[10]) / 2.0;

        System.out.print("\nVetor Original: ");
        for (int v : original) System.out.print(v + " ");

        System.out.print("\nVetor Ordenado: ");
        for (int v : ordenado) System.out.print(v + " ");

        System.out.println("\n\nQuantidade de comparações: " + comparacoes);
        System.out.println("Quantidade de trocas: " + trocas);
        System.out.println("Mediana: " + mediana);

    }
}


    
}
