//Classificação de Idade
//Peça a idade do usuário e exiba sua categoria:
//Menor de 12: Criança  || Entre 12 e 18: Adolescente || Maior que 18: Adulto

package com.training.fundamentos.controleDeFluxo.basicos;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade para verificar a faixa etária");
        int age = scanner.nextInt();

        if (age < 12){
            System.out.println("Você é uma criança");
        }else if (age < 18){
            System.out.println("Você é um adolescente");
        }else {
            System.out.println("Você é um adulto");
        }
    }
}
