/*1. Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba
 em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
 seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67*/

public class Temperatura {
    public static void main(String[] args) {
        double C, F, K, Re, Ra;

        C = 2.43;
        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;

        System.out.printf("A temperatura em Fahrenheit é: %.2f \n", F);
        System.out.printf("A temperatura em Kelvin é:  %.2f \n", K);
        System.out.printf("A temperatura em Reaumur é:  %.2f \n", Ra);
        System.out.printf("A temperatura em Rankine é:  %.2f \n", Re);
    }
}