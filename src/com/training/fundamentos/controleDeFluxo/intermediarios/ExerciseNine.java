//Fatorial de um Número (While ou For)
//Peça um número N e calcule seu fatorial (N! = N × (N-1) × ... × 1).

package com.training.fundamentos.controleDeFluxo.intermediarios;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular seu fatorial: ");
        int n = scanner.nextInt();

        int fatorial = 1;

        for (int i = n; i > 0; i--){
            fatorial *= i;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial + ".");
        scanner.close();
    }
}
