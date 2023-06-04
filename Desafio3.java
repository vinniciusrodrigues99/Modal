import java.util.Random;

public class Desafio3 {

    public static void main(String[] args) {
        int[] numeros = gerarNumerosAleatorios(100);

        int[] numerosImpares = new int[numeros.length];
        int[] numerosParesResto5 = new int[numeros.length];
        int contImpares = 0;
        int contParesResto5 = 0;

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            
            if (numero % 2 != 0) {
                numerosImpares[contImpares] = numero;
                contImpares++;
            } else {
                numerosParesResto5[contParesResto5] = numero % 5;
                contParesResto5++;
            }
        }

        int[] impares = new int[contImpares];
        int[] paresResto5 = new int[contParesResto5];

        for (int i = 0; i < contImpares; i++) {
            impares[i] = numerosImpares[i];
        }

        for (int i = 0; i < contParesResto5; i++) {
            paresResto5[i] = numerosParesResto5[i];
        }

        System.out.println("Números ímpares:");
        exibirValores(impares);

        System.out.println("Números pares (resto da divisão por 5):");
        exibirValores(paresResto5);
    }

    public static int[] gerarNumerosAleatorios(int quantidade) {
        Random random = new Random();
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = random.nextInt();
        }
        return numeros;
    }

    public static void exibirValores(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}
/*
 * 3) A ModalGR possui um sistema em desenvolvimento que recebe um vetor de 100 números
inteiros gerados de forma randômica. A partir desses valores armazenar em vetores distintos:
Primeiro vetor: os números que são ímpares;
Segundo vetor: o resultado do resto da divisão por 5 dos números pares.

Visando atender esse quesito, você foi escolhido para nos ajudar nessa solução!
Após a finalização exibir em tela os valores de cada um dos vetores.
 */
    

