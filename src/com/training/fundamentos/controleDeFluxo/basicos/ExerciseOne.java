//EXERCÍCIO UM:
//
// ** Verificação de Par ou Ímpar **
//
//Peça um número ao usuário e verifique se é par ou ímpar.

package com.training.fundamentos.controleDeFluxo.basicos;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é par ou ímpar: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("O número é par");
        }else {
            System.out.println("O número é ímpar");
        }
    }
}