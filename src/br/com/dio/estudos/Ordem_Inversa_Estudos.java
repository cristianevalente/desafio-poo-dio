package br.com.dio.estudos;

public class Ordem_Inversa_Estudos {
    public static void main(String[] args) {
        int[] vetor = {81, 60, 41, 39, 65, 15};

        System.out.println("Vetor");
        int count = 0;
        while (count < (vetor.length)) { /*length = mostra o tamanho do vetor; <vetor.lenght porque cabem 6 números no array, mas
        ele só vai até a posição 5, porque começa a contar da posição 0.*/
            System.out.println(vetor[count] + " ");
            count++;
        }
        for (int i = (vetor.length - 1); i == 0; i--) {

            System.out.println(vetor[i] + " ");
        }
    }
}