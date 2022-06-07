// ARRAY FOR
import java.util.Scanner;

public class Aula2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos da turma: ");
        int num_alunos = teclado.nextInt();
        String[] alunos = new String[num_alunos];
        for (int i = 0; i < alunos.length; i++) {
          System.out.print("Digite o nome do aluno:");
          teclado.nextLine();
          String linha = teclado.nextLine();
          System.out.print("Digite o valor da primeira nota: ");
          float nota1 = teclado.nextFloat();
          linha = linha + " | " +  nota1;
          System.out.print("Digite o valor da segunda nota: ");
          float nota2 = teclado.nextFloat();
          linha = linha + " | " +  nota2;
          float media = (nota1 + nota2)/2;
          linha = linha + " | " +  media;
          
          
          if (media >= 7) {
            if (media >= 9) {
              linha = linha + " | " +  "Excelente,";
            }
            linha = linha + " " +  "Aluno aprovado.";
          } else if (media >= 4) {
            linha = linha + " | " +  "Aluno em recuperação.";
          } else {
            linha = linha + " | " +  "Aluno não aprovado.";
          }
          alunos[i] = linha;
        } 
        for (int i = 0; i < alunos.length; i++) {
          System.out.println(alunos[i]);  
        }
    }
}

