package br.com.dio.estudos;


import java.util.Scanner;

public class Consoantes_Estudos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a")| /* | - ou/ IgnoreCase - para aceitar maiúscula e minúscula*/
                letra.equalsIgnoreCase("e") | /* | - ou*/
                letra.equalsIgnoreCase("i") |/* | - ou*/
                letra.equalsIgnoreCase("o") |/* | - ou*/
                letra.equalsIgnoreCase("u") )){/* | - ou*/

            consoantes[count] = letra;
            quantidadeConsoantes++; /*para adicionar +1 à quantidade de consoantes*/
        }
        count++;

        } while(count<consoantes.length); /*enquanto count for menor do que o array de consoantes*/
        System.out.print("Consoantes: ");
        for (String consoante: consoantes){/*para cada elemento dentro deste array de consoantes*/
                if(consoante != null)
        System.out.println(consoante + " ");
}
            System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
            System.out.println("Quantidade de posições: " + consoantes.length);
    }
}
