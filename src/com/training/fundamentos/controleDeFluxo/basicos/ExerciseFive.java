//Dia da Semana (Switch-Case)
//Peça um número de 1 a 7 e exiba o dia correspondente (ex: 1 → Domingo, 2 → Segunda-feira...).

package com.training.fundamentos.controleDeFluxo.basicos;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número de 1 a 7 para saber qual dia da semana é.");
        int day = scanner.nextInt();

        String text = "O dia da semana é: ";
        switch (day){
            case 1:
                System.out.println(text + "Domingo");
                break;
            case 2:
                System.out.println(text + "Segunda-feira");
                break;
            case 3:
                System.out.println(text + "Terça-feira");
                break;
            case 4:
                System.out.println(text + "Quarta-feira");
                break;
            case 5:
                System.out.println(text + "Quinta-feira");
                break;
            case 6:
                System.out.println(text + "sexta-feira");
                break;
            case 7:
                System.out.println(text + "Sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }
        scanner.close();
    }
}
