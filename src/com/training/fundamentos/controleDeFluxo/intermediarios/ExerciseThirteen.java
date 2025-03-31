//Média de Notas (Do-While)
//O usuário digita notas até inserir 1, então o programa exibe a média das notas.

package com.training.fundamentos.controleDeFluxo.intermediarios;

import java.util.Scanner;

public class ExerciseThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int count = 0;
        double nota;

        do{
            System.out.println("Digite uma nota para somar (ou 1 para sair): ");
            nota = scanner.nextDouble();

            if(nota != 1){
                soma += nota;
                count++;
            }
        } while (nota != 1);

        scanner.close();

        if(count > 0){
            double media = soma / count;
            System.out.println("Média das notas inseridas: " + String.format("%.2f", media));
        }else {
            System.out.println("Nenhuma nota válida inserida.");
        }
    }
}
