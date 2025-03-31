// Soma de Dígitos de um Número (While)
// Peça um número e some todos os seus dígitos (ex: 123 → 1 + 2 + 3 = 6).

package com.training.fundamentos.controleDeFluxo.intermediarios;

import java.util.Scanner;

public class ExerciseTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = scanner.nextInt();

        int sum = 0;

        while(number > 0){
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Soma dos dígitos é: " + sum + ".");
        scanner.close();
    }
}
