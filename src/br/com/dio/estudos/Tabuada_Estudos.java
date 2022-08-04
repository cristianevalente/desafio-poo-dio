package br.com.dio.estudos;

import java.util.Scanner;

public class Tabuada_Estudos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("De qual número você quer saber a tabuada?: ");
        int tabuada = scan.nextInt();
                System.out.println("Tabuada de: " + tabuada);


        for(int i = 1; i <= 10; i = i + 1){

            System.out.println(tabuada + "X " + i + "= " + (tabuada * i));
        }
    }
}
