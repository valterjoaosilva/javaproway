package ExerciciosJava;
import java.util.Scanner;

public class Exerc02operacoes {
    public static void main(String[] args) throws Exception {
        int numero1 = 0;
        int numero2 = 0;
        int soma = 0;
        int sub = 0;
        int mult = 0;
        int divi = 0;

        Scanner n = new Scanner(System.in);

        System.out.println("Digite primeiro número: ");
        numero1 = n.nextInt();

        System.out.println("Digite segundo número: ");
        numero2 = n.nextInt();

        soma = numero1 + numero2;
        sub = numero2 - numero1;
        mult = numero1 * numero2;
        divi = numero2 / numero1;

        System.out.println("soma de: " + numero1 +" + "+ numero2 +" = " + soma );
        System.out.println("subtração de: " + numero2 +" - "+ numero1 +" = " + sub );
        System.out.println("multiplicação de: " + numero1 +" x "+ numero2 +" = " + mult );
        System.out.println("divisão de: " + numero2 +" : "+ numero1 +" = " + divi );



    }
}
