//Contagem Regressiva (While)
//Solicite um número N e exiba uma contagem regressiva de N até 0 usando um while.

package com.training.fundamentos.controleDeFluxo.intermediarios;

import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número para ver a contagem regressiva: ");
        int number = scanner.nextInt();

        while (number >= 0){
            System.out.println(number);
            number--;
        }
        scanner.close();
    }

}
