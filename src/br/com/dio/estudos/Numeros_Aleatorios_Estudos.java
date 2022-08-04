package br.com.dio.estudos;

import java.util.Random;

public class Numeros_Aleatorios_Estudos {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero; /*esse i vai receber os números aleatórios gerados pelo random.*/

        }
        System.out.print("\nNúmeros Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero) + " ");
        }
        System.out.print("\nAntecessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");

        }
        System.out.print("\nSucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }


    }
}
