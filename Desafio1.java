import java.util.Scanner;
import java.lang.Math;

public class Desafio1
{
    public static void main(String[] args) 
    {
        double pesoPrato, valorKg, precoTotal, taraPrato, pesoFinal, pesoGramas;
        Scanner ler = new Scanner(System.in);
        System.out.println("****Bem vindo ao Restaurante Modal!****");
        System.out.println("Por favor, digite o valor do KG da comida: ");
        valorKg = ler.nextDouble();
        System.out.println("digite o valor para a tara do prato(peso do prato vazio em gramas): ");
        taraPrato = ler.nextDouble();
        System.out.println("digite o peso do prato(com a refeição em gramas): ");
        pesoPrato= ler.nextDouble();
        pesoFinal = pesoPrato - taraPrato;
        precoTotal = pesoFinal * (valorKg/1000);
        System.out.printf("O prato de %.0f gramas custa: R$%.2f", pesoFinal, precoTotal);

    }
}
/*
 * 1) A ModalGR possui um sistema em desenvolvimento para um restaurante e numa parte
específica será necessário calcular o valor da refeição realizada pelo cliente, retornando uma
mensagem no seguinte formato:
O prato de x gramas custa: R$x,yz
Visando atender esse quesito, você foi escolhido para nos ajudar nessa solução!
A ideia é ter 3 campos: um para inserção do valor do quilo, outro para a tara do prato e o último
para o peso do prato (refeição), e em seguida, exibir a mensagem no padrão exigido.
Observações:
 O valor do prato deve conter duas casas decimais após a virgula;
 Lembre-se de descontar a tara do prato no peso da refeição, para assim calcular o
valor corretamente a ser pago.
2) A ModalGR possui um sistema em desenvolvi
 */