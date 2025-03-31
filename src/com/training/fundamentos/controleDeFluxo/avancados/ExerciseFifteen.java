//Jogo de Adivinhação (While ou Do-While)
// O programa gera um número aleatório entre 1 e 100 e o usuário tenta adivinhar.
// O programa responde se o chute é muito alto ou muito baixo até acertar.

package com.training.fundamentos.controleDeFluxo.avancados;

import java.util.Scanner;

public class ExerciseFifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess;
        int attempts = 0;
        final int MAX_ATTEMPTS = 10;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar um número entre 1 e 100. Você tem " + MAX_ATTEMPTS + " tentativas!");
        System.out.println("-----------------------------------------------------------------------------");
        do {
            System.out.println("\nTente advinhar o número sorteado: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("Quase lá, o número sorteado é menor que " + guess);
            }else if (guess < randomNumber){
                System.out.println("Quase lá, o número sorteado é maior que " + guess);
            }
        } while (attempts < 10 && guess != randomNumber);

        if (guess == randomNumber){
            System.out.println("Parabéns! Você acertou o número " + randomNumber + " em " + attempts + " tentativas!");
        } else{
            System.out.println("Você esgotou suas " + MAX_ATTEMPTS + " tentativas. O número era " + randomNumber + ".");
        }
        scanner.close();
    }
}
