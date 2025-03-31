//Número Perfeito (For)
//Um número é perfeito se a soma de seus divisores (excluindo ele mesmo) for igual a ele.
//Exemplo: 6 → 1 + 2 + 3 = 6 (Perfeito)

package com.training.fundamentos.controleDeFluxo.avancados;

import java.util.Scanner;

public class ExerciseSeventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é perfeito: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0){
                sum += i;
            }
        }
        if (sum == number ){
            System.out.println("O número é perfeito");
        }else {
            System.out.println("O número não é perfeito");
        }

    }
}
