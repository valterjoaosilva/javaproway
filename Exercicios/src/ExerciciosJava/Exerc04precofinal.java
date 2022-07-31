package ExerciciosJava;
import java.util.Scanner;

public class Exerc04precofinal {
    public static void main(String[] args) throws Exception{
        double preco_Carro = 0;
        int custo_Fabrica = 0;
        double distribuidor = 0;
        double imposto = 0;

        Scanner cf = new Scanner(System.in);


        System.out.println("Qual o custo de Fábrica: ");
        custo_Fabrica = cf.nextInt();

        imposto = custo_Fabrica * 0.45;
        distribuidor = (custo_Fabrica + imposto) * 0.28;
        preco_Carro = custo_Fabrica + distribuidor + imposto;
        
        System.out.println("O Custo de Fábrica é: "+ custo_Fabrica);
        System.out.println("O valor do imposto que incide sobre o carro é: "+ imposto);
        System.out.println("O percentual do distribuidor é: "+ distribuidor);
        System.out.println("O preço carro ao consumidor final é: "+ preco_Carro);
        cf.close();

        
    }
}
