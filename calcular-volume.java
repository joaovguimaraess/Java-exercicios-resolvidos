/*Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: 
V = 3.14159 * R * R * A, em que as variáveis: V, R e A representam respectivamente o volume, 
o raio e a altura. Vamos declarar as variáveis V, R e A como double e definir um valor qualquer
para as variáveis de altura e de raio. Agora vamos escrever a fórmula, conforme dita no enunciado
e, em seguida, exibir na tela uma mensagem contendo o resultado do volume encontrado.*/

import java.util.Locale;   //ler valores decimais com virgula
import java.util.Scanner;  // ler entrada de valores

class calcularVolume {
    public static void main(String[] args) {
        double V, R, A;
        V = 3.14159;

        Scanner ler = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor do raio: ");
        R = ler.nextDouble();
        System.out.print("Digite o valor da altura: ");
        A = ler.nextDouble();

        V = 3.14159 * R * R * A;
        System.out.printf("O volume encontrado foi de: %.2f", V);
        ler.close();
    }
}