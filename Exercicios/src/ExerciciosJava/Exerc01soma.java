package ExerciciosJava;
import java.util.Scanner;

public class Exerc01soma {
    public static void main(String[] args) throws Exception {

        int numero1 = 0;
        int numero2 = 0;
        int soma = 0;

        Scanner n = new Scanner(System.in);


        System.out.println("Digite o primeiro número");
        numero1 = n.nextInt();

        System.out.println("Digite o segundo número");
        numero2 = n.nextInt();

        soma = numero1 + numero2;

        System.out.println("A soma de: "+ numero1 +" + " + numero2 +" = "+soma );
    }
}
