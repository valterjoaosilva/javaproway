package ExercicioQuinze;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) throws Exception {
     int numero;
     
     
     Scanner leitorScanner = new Scanner(System.in);
     
     System.out.println("Digite um Número");
     numero = leitorScanner.nextInt();
            
            
     if(numero >= 100 && numero <= 200){
        System.out.println("Numero está dentro da relação");
     }else{
        System.out.println("O número não está dentro da relação");
     }


        System.out.println("Hello, World!");
    }
}
