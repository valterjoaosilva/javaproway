package ExerciciosJava;
import java.util.Scanner;

public class Exerc05Maioridade {
    public static void main(String[] args) throws Exception {
        int idade = 0;

        Scanner id = new Scanner(System.in);

        for(int i =0; i < 5; i++){
            System.out.println("Digite a idade: ");
            idade = id.nextInt();
                if(idade > 17){
                    System.out.println("Maior de Idade");

                }else{
                    System.out.println("Menor de idade");
                }
                id.close();


        }
        
        
    }
}
