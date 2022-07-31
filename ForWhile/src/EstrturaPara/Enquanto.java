package EstrturaPara;
import java.util.Scanner;


public class Enquanto {
    public static void main(String[]args)throws Exception{

      var totalAlunos = 2;
      Scanner leitorScanner = new Scanner(System.in);
        
        
      while(totalAlunos > 0){
        
        System.out.println("Qual o nome do Aluno? ");
        String nomeAluno = leitorScanner.nextLine();
        
        

        System.out.println("Qual a Idade do Aluno? ");
        int idadeAluno = leitorScanner.nextInt();
        //limpar o buffer do teclado
        leitorScanner.nextLine();

        System.out.println( "O nome do aluno é: " + nomeAluno + " e sua idade é: " + idadeAluno );  

        totalAlunos = totalAlunos - 1;
      }
      leitorScanner.close();
      }

         
    }
    
