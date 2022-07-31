package ExerciciosJava;
import java.util.Scanner;

public class Exerc06AumentoFuncionarios {
    public static void main(String[] args) throws Exception {

        //variáves:
        int i = 0;
        int salario = 0;
        int salario_Minimo = 200;
        double novo_Salario = 0;
        int reajuste = 0;
        int soma_Salario = 0;
        double percentual_Aumento = 0;
        double soma_Novo_Salario = 0;

        
        Scanner sl = new Scanner(System.in);

        while(i < 5){
            System.out.println("Digite o nome do funionário: ");
            String funcionario = sl.nextLine();

            System.out.println("Digite o salário do funcionário: "+ funcionario);
            salario = sl.nextInt();
            if(salario < salario_Minimo * 3){
                novo_Salario = salario * 1.50;
                reajuste = 50;
            }else if(salario < salario_Minimo * 10){
                novo_Salario = salario * 1.20;
                reajuste = 20;
            }else if(salario < salario_Minimo  * 20){
                novo_Salario = salario * 1.15;
                reajuste = 15;
            }else{
                novo_Salario = salario * 1.10;
                reajuste = 10;
            }
            soma_Salario = soma_Salario + salario;
            soma_Novo_Salario = soma_Novo_Salario + novo_Salario;
            System.out.println("O funcionário: "+ funcionario +" seu novo salário é: "+ novo_Salario + " seu reajuste é de: "+ reajuste +"%");
            i++;
                 
        }
       sl.close();
        
        
        percentual_Aumento = ((soma_Novo_Salario / soma_Salario) - 1) * 100;
        System.out.println("Total da nova folha de pagamento: "+ soma_Novo_Salario + "o percentual de aumento da folha foi:"+ percentual_Aumento +"%");
        
    }
}
