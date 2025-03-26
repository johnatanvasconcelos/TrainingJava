//Contagem de 1 até N (For)
//Use um for para imprimir os números de 1 até o número que o usuário digitar.

package com.training.fundamentos.controleDeFluxo.basicos;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número pra ver a sequência de 1 até ele: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++){
            System.out.println(i);
        }
    }
}
