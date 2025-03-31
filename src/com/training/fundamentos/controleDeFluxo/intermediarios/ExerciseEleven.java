//Verificação de Número Primo (For)
//Peça um número e determine se ele é primo (divisível apenas por 1 e ele mesmo).

package com.training.fundamentos.controleDeFluxo.intermediarios;

import java.util.Scanner;

public class ExerciseEleven {

    public static boolean ehPrimo(int number) {
        if (number < 2) return false; //números menores que 2 não são primos
        if (number == 2) return true; // 2 é um número primo
        if (number % 2 == 0) return false; // Se for par, não é primo

        int limit = (int) Math.sqrt(number); // Obtendo a raiz quadrada de number e realizando um 'casting' para int
        for (int i = 3; i <= limit; i += 2) { // Testa apenas números ímpares
            if (number % i == 0) return false; // Se for divisível, não é primo
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é primo: ");
        int number = scanner.nextInt();

        if (ehPrimo(number)){
            System.out.println(number + " é primo!");
        }else {
            System.out.println(number + " não é primo!");
        }
    }
}
