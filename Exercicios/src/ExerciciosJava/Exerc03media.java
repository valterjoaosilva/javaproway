package ExerciciosJava;
import java.util.Scanner;

public class Exerc03media {
    public static void main(String[] args)throws Exception {
        int consumoMedio = 0;
        int distanciapercorida = 0;
        int consumo = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a distância percorrida pelo veículo?");
        distanciapercorida = sc.nextInt();

        System.out.println("Qual o consumo total do veículo?");
        consumo = sc.nextInt();

        consumoMedio = distanciapercorida / consumo;

        System.out.println("O consumo médio é: "+ consumoMedio + " km/lt ");


    }
}
