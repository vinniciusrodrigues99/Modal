import java.util.Scanner;

public class Desafio2 
{
    public static void main(String[] args)
    {
    String entrada = "Ana Maria da Silva Coração";
    int quantidadeDeA = 0;
    for (int i = 0; i < entrada.length(); i++) 
    {
    char caractere = entrada.charAt(i);
        if (caractere == 'a' || caractere == 'A') 
        {
        quantidadeDeA++;
        }
    }
    System.out.println("Quantidade de letras \"a\" minúscula: " +quantidadeDeA);
    }
}
/*
 * 2) A ModalGR possui um sistema em desenvolvimento que recebe uma palavra/frase, a partir
disso exibir a quantidade de letra(s) “a” minúscula(s) presentes nessa palavra/frase
Entrada: Ana Maria da Silva Coração
Saída: Quantidade de letras “a” minúscula: 6
Visando atender esse quesito, você foi escolhido para nos ajudar nessa solução!
Após a finalização exibir em tela a mensagem no padrão exigido.
Observação:
 Ignorar letra “a” com acentuação.
 */