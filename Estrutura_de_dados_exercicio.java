package estrutura_de_dados_exercicio;

public class Estrutura_de_dados_exercicio {
    
    int tamanho;
    int topo;
    Object vetor[];
 
    Estrutura_de_dados_exercicio(int tam){
    this.topo = -1;
    this.tamanho = tam;
    this.vetor = new Object[tam];
    }
 
    public boolean vazia(){
        if (topo == -1) {
            return true;
        } else {
            return false;
        }
    }
 
    public boolean cheia(){
        if (topo >= tamanho) {
            return true;
        } else {
            return false;
        }
    }
 
    public void empilhar(Object elem) {
        if(this.cheia() == false){
            topo++;
            vetor[topo] = elem;
        } else {
            System.out.println("Pilha cheia");
        }
    }
 
    public Object desempilhar() {
    Object valorDesempilhado;
    if (this.vazia() == true) {
        System.out.print("Pilha Vazia");
        valorDesempilhado = null;
    } else {
        valorDesempilhado = vetor[topo];
        topo--;
    }
    return valorDesempilhado;
    }
 
    public void exibirPilha() {
        for (int i = topo; i >= 0; i--) {
    System.out.println("Elemento " + vetor[i] + " posição " + i);
        }
    }
}
