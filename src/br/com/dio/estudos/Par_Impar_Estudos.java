package br.com.dio.estudos;

import java.util.Scanner;

public class Par_Impar_Estudos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        /*int quantidadeImpares, quantidadePares = 0;*/
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();


        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            count++;

        }while (count <  quantidadeNumeros);

        System.out.println("Quantidade de Pares: " + quantidadePares);
        System.out.println("Quantidade Ímpares: " + quantidadeImpares);
        }
    }

