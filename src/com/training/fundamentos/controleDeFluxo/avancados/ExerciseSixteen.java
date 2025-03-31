//Palíndromo (For ou While)
//Peça uma palavra e verifique se é um palíndromo (ex: "arara", "osso").

package com.training.fundamentos.controleDeFluxo.avancados;

import java.util.Scanner;

public class ExerciseSixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra para verificar se é um palíndromo: ");
        String word = scanner.nextLine();
        word = word.toLowerCase();
        scanner.close();

        boolean isPalindromo = true;
        int lengthWord = word.length();

        for (int i = 0; i < lengthWord / 2; i++) {
            if (word.charAt(i) != word.charAt(lengthWord - 1 - i)) {
                isPalindromo = false;
                break;
            }
        }

        if (isPalindromo) {
            System.out.println("A palavra " + word + " é um palíndromo!");
        } else {
            System.out.println("A palavra " + word + " NÃO é um palíndromo.");
        }

    }
}
