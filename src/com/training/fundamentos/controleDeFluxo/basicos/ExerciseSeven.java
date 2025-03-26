//Tabuada de um Número (For)
//Peça um número e exiba sua tabuada de 1 a 10 usando um for.

package com.training.fundamentos.controleDeFluxo.basicos;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número pra ver sua tabuada:");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number*i));
        }
    }
}
