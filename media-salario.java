/*Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade 
de funcionários e os salários, e devolvendo a média salarial.*/

class mediaSalario {
    public static void main(String[] args) {
        double salarioA, salarioB, salarioC, salarioD, media;
        salarioA = 1280;
        salarioB = 2100.90;
        salarioC = 10980.19;
        salarioD = 2450;

        media = (salarioA + salarioB + salarioC + salarioD) / 4;
        System.out.printf("A media salario da empresa e de: R$ %.2f", media);
    }
}