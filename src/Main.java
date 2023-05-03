import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Questão 1
        // Ao final do processamento, qual será o valor da variável SOMA?
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        // A variável soma é igual a: 91;
        System.out.println("O valor da variável SOMA é: " + SOMA);


        // Questão 2
        /*
         Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
         anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
         informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
         pertence ou não à sequência.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número:");
        int number = scan.nextInt();

        if (pertenceFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
        // Método pertenceFibonacci está abaixo.


        // Questão 3)
        // Descubra a lógica e complete o próximo elemento:
        /*
        a) 1, 3, 5, 7, (9).--------------------Adicionar 2 ao número anterior.
        b) 2, 4, 8, 16, 32, 64, (128).---------Multiplicar por 2 o número anterior.
        c) 0, 1, 4, 9, 16, 25, 36, (49).-------Adicionar o próximo número ímpar ao número anterior.
        d) 4, 16, 36, 64, (100).---------------Elevar o próximo número par ao quadrado, iniciando do 2.
        e) 1, 1, 2, 3, 5, 8, (13).-------------Somar os dois números anteriores.
        f) 2, 10, 12, 16, 17, 18, 19, (200).---O próximo número, escrito, deve começar com a letra "D".
        */


        // Questão 4)
        /*
        Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. O carro de
        Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a
        Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo
        a cidade de Ribeirão Preto?
        IMPORTANTE:
        a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.
        b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)
        c) Explique como chegou no resultado.
        */

        /*
        Resposta:
        Quando se cruzarem na rodovia, ambos os veículos estarão à mesma distância de Ribeirão Preto.
        No momento de encontro, os dois estarão mais perto de Franca, pois o carro é mais rápido e o caminhão perde 5
        minutos em cada pedágio. Mas no instante do encontro, os dois veículos estarão à mesma distância de Ribeirão
        Preto.
        */


        // Questão 5
        // Escreva um programa que inverta os caracteres de um string.
        System.out.println("Insira uma palavra:");
        String nome = scan.next();
        char[] letras = nome.toCharArray();

        for (int i = 0; i < letras.length / 2; i++) {
            char temp = letras[i];
            letras[i] = letras[letras.length - 1 - i];
            letras[letras.length - 1 - i] = temp;
        }

        String nomeInvertido = new String(letras);
        System.out.println("Palavra invertida: " + nomeInvertido);
    }


    public static boolean pertenceFibonacci(int numero) {
        int a = 0;
        int b = 1;
        int c = a + b;

        if (numero == a || numero == b) {
            return true;
        }
        while (c <= numero) {
            if (c == numero) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
}