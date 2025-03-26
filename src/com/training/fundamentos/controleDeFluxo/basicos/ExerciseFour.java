//Calculadora Simples (Switch-Case)
//Solicite dois números e uma operação (+, -, *, /) e use um switch-case para calcular o resultado.

package com.training.fundamentos.controleDeFluxo.basicos;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double firstNumber = scanner.nextDouble();
        System.out.println("Digite o segundo número");
        double secondNumber = scanner.nextDouble();

        System.out.println("Escolha uma operação: " +
                            "\n1- Soma" +
                            "\n2- Subtração" +
                            "\n3- Multiplicação" +
                            "\n4- Divisão");

        int operation = scanner.nextInt();
        double result;

        switch (operation){
            case 1:
                result = firstNumber + secondNumber;
                System.out.println("O Resultado da soma é: " + result);
                break;
            case 2:
                result = firstNumber - secondNumber;
                System.out.println("O resultado da subtração é: " + result);
                break;
            case 3:
                result = firstNumber * secondNumber;
                System.out.println("O resultado da multiplicação é: " + result);
                break;
            case 4:
                if(secondNumber == 0){
                    System.out.println("Erro. Divisão por zero impossível.");
                }else{
                    result = firstNumber / secondNumber;
                    System.out.println("O resultado da divisão é: " + result);
                }
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
