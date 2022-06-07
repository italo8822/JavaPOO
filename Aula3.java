import java.util.Scanner;

public class Aula3 {

    private String[] alunos;
    private int posicao;

    public Aula3() {
      alunos = new String[2];
      posicao = 0;
    }

    public void inserir(String aluno){
      if (posicao < alunos.length) {
        alunos[posicao] = aluno;
        posicao++;
        System.out.println("Aluno inserido com sucesso."); 
      } else {
        String[] temp = new String[alunos.length * 2];
        for(int i = 0; i < alunos.length; i++){
          temp[i] = alunos[i];
        }
        alunos = temp;
        System.out.println("Armazenamento atualizado: "+ alunos.length); 
        this.inserir(aluno);
      }
    }

    public void imprimir(){
      for(int n = 0; n < alunos.length; n++) {
          if (alunos[n] == null) {
            break;
          }
          System.out.println(alunos[n]);
      }  
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Aula3 ed = new Aula3();

        int controle = 0;
        
        while(controle == 0) {
          System.out.print("Digite o nome do aluno: ");
          String aluno = teclado.nextLine();
                    
          System.out.print("Digite o valor da primeira nota: ");
          float nota1 = teclado.nextFloat();
          aluno = aluno + " | " + nota1;
          
          System.out.print("Digite o valor da segunda nota: ");
          float nota2 = teclado.nextFloat();
          aluno = aluno + " | " + nota2;
          
          float media = (nota1 + nota2)/2;
          aluno = aluno + " | " + media;
          
          if (media >= 7) {
            aluno = aluno + " | ";
            if (media >= 9) {
              aluno = aluno + " Excelente, ";
            }
            aluno = aluno + " Aluno aprovado ";
          } else if (media >= 4) {
            aluno = aluno + " | Aluno em recuperação";
          } else {
            aluno = aluno + " | Aluno não aprovado";
          }
          ed.inserir(aluno);
          
          System.out.print("Digite 0 para mais alunos:  ");
          controle = teclado.nextInt();
          teclado.nextLine();
        } 
        ed.imprimir();
    }
}
