// ARRAY WHILE
import java.util.Scanner;

public class Aula2_Part2 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos da turma: ");
        int num_alunos = teclado.nextInt();
        String[] alunos = new String[num_alunos];
        int controle = 0;
        while(controle < alunos.length) {
          System.out.print("Digite o nome do aluno: ");
          teclado.nextLine();
          String nome = teclado.nextLine();
          alunos[controle] = nome;
          
          System.out.print("Digite o valor da primeira nota: ");
          float nota1 = teclado.nextFloat();
          alunos[controle] = alunos[controle] + " | " + nota1;
          
          System.out.print("Digite o valor da segunda nota: ");
          float nota2 = teclado.nextFloat();
          alunos[controle] = alunos[controle] + " | " + nota2;
          
          float media = (nota1 + nota2)/2;
          alunos[controle] = alunos[controle] + " | " + media;
          
          if (media >= 7) {
            alunos[controle] = alunos[controle] + " | ";
            if (media >= 9) {
              alunos[controle] = alunos[controle] + " Excelente, ";
            }
            alunos[controle] = alunos[controle] + " Aluno aprovado ";
          } else if (media >= 4) {
            alunos[controle] = alunos[controle] + " | Aluno em recuperação";
          } else {
            alunos[controle] = alunos[controle] + " | Aluno não aprovado";
          }
          
          controle++;
        } 
        for(int i = 0; i < alunos.length; i++) {
          System.out.println(alunos[i]);
        }
    }
}