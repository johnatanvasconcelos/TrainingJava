//Número Invertido (While)
//Peça um número e exiba-o ao contrário (ex: 1234 → 4321)

package com.training.fundamentos.controleDeFluxo.intermediarios;

import java.util.Scanner;

public class ExerciseFourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();
        scanner.close();

        int invertedNumber = 0;

        while (number > 0) {
            int lastNumber = number % 10;
            invertedNumber = invertedNumber * 10 + lastNumber;
            number /= 10;
        }

        System.out.println("Número invertido: " + invertedNumber);
    }
}
