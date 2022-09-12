/*Escreva um programa para determinar a quantidade de cavalos necessários para se levantar uma massa
de m quilogramas a uma altura de h metros em t segundos. 
Considere cavalos = (m * h / t) / 745,6999 */

class calcularMassa {
    public static void main(String[] args) {
        double m, h, t, cavalos;
        m = 50;
        h = 2.2;
        t = 1.2;

        cavalos = (m * h / t) / 745.6999;

        System.out.printf("A quantidade de cavalos necessários é: %.2f", cavalos);
    }
}