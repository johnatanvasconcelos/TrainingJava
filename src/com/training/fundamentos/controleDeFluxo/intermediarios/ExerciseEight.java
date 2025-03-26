//Soma de Números Pares (For)
//Solicite um número N e some todos os números pares de 1 até N.

package com.training.fundamentos.controleDeFluxo.intermediarios;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++ ){
            if(i % 2 == 0){
                sum += i; //sum = sum + i
            }
        }

        System.out.println("A soma dos números pares de 1 até " + number + " é: " + sum + ".");

    }
}
