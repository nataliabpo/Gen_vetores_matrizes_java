package listaVetoresMatrizes;

import java.util.Scanner;

public class Matrizes03 {

	public static void main(String[] args) {
		
        int[][] matriz = new int[3][3];

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        // Lendo a matriz do usuário
        Scanner sc = new Scanner(System.in);
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Digite o elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        System.out.println("Elementos da Diagonal Principal:");
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.print(matriz[linha][linha] + " ");
            somaPrincipal += matriz[linha][linha];
        }
        System.out.println();

        System.out.println("Elementos da Diagonal Secundária:");
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.print(matriz[linha][2 - linha] + " ");
            somaSecundaria += matriz[linha][2 - linha];
        }
        System.out.println();

        System.out.println("Soma dos Elementos da Diagonal Principal: " + somaPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);
    }
}
