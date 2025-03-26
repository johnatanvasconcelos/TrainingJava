//EXERCÍCIO DOIS
//
// ** Maior entre dois números **
//
//Solicite dois números e exiba qual é o maior ou se são iguais.

package com.training.fundamentos.controleDeFluxo.basicos;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n------------------------------------------------- \n");
        System.out.println("Vamos comparar dois números e saber quem é o maior!");
        System.out.println("\nDigite o primeiro número: ");
        int numberOne = scanner.nextInt();
        System.out.println("\nDigite o segundo número: ");
        int numberTwo = scanner.nextInt();

        System.out.println("\n------------------------------------------------- \n");

        if(numberOne > numberTwo) {
            System.out.println("O número " + numberOne + " é maior que o número " + numberTwo);
        }else if(numberOne < numberTwo){
            System.out.println("O número " + numberTwo + " é maior que o número " + numberOne);
        }else {
            System.out.println("Os números são iguais :/ " + numberOne + " = " + numberTwo);
        }
    }
}
