//  MATRIZ
import java.util.Scanner;


public class Aula3_Part2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos da turma: ");
        int num_alunos = teclado.nextInt();
        String[][] alunos = new String[num_alunos][5];
       // System.out.println("Tamanho dimensao 1: " + alunos.length);
       // System.out.println("Tamanho dimensao 2: " + alunos[0].length);
        for (int i = 0; i < alunos.length; i++) {
          System.out.print("Digite o nome do aluno: ");
          teclado.nextLine();
          alunos[i][0] = teclado.nextLine();
          System.out.print("Digite o valor da primeira nota: ");
          float nota1 = teclado.nextFloat();
          alunos[i][1]  = String.valueOf(nota1);
          System.out.print("Digite o valor da segunda nota: ");
          float nota2 = teclado.nextFloat();
          alunos[i][2]  =  String.valueOf(nota2);
          float media = (nota1 + nota2)/2;
          alunos[i][3]  =  String.valueOf(media);
          
          alunos[i][4] = "";
          if (media >= 7) {
            if (media >= 9) {
              alunos[i][4]  =  "Excelente,";
            }
            alunos[i][4] = alunos[i][4] +  "Aluno aprovado.";
          } else if (media >= 4) {
            alunos[i][4] = "Aluno em recuperação.";
          } else {
            alunos[i][4] = "Aluno não aprovado.";
          }
      } 
      
      for (int i = 0; i < alunos.length; i++) {
        for (int n = 0; n < alunos[0].length; n++) {
          System.out.print(alunos[i][n] + " | ");  
        }
          System.out.println();  
      }
    }
}

