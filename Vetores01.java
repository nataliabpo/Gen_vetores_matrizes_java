package listaVetoresMatrizes;
import java.util.Scanner;
public class Vetores01 {

	public static void main(String[] args) {
		 // Declarando o vetor
        int[] vetorInteiros = new int[10];
        Scanner leia = new Scanner(System.in);

        // Lendo os números do usuário
        for (int indice = 0; indice < vetorInteiros.length; indice++) {
            System.out.println("Digite o " + (indice + 1) + "º número: ");
            vetorInteiros[indice] = leia.nextInt();
        }

        // Solicitando ao usuário o número a ser pesquisado
        System.out.println("Digite o número a ser pesquisado: ");
        int numeroPesquisado = leia.nextInt();
        // Inicializando a variável de posição
        int posicao = -1;

        // Percorrendo o vetor
        for (int i = 0; i < vetorInteiros.length; i++) {

            // Se o número encontrado for igual ao número pesquisado, atualizamos a variável de posição
            if (vetorInteiros[i] == numeroPesquisado) {
                posicao = i;
                break;
            }
        }

        // Exibindo o resultado da pesquisa
        if (posicao != -1) {
            System.out.println("O número " + numeroPesquisado + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("O número " + numeroPesquisado + " não foi encontrado!");
        }
    }
}	

