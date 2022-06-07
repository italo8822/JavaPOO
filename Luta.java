package aula7;

import java.util.Random;

public class Luta {
    //Atributos:
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    //Metodos publicos:
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) { //(l1.getCategoria() == l2.getCategoria())
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar() {
        if (this.aprovado) {
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();
            System.out.println("### Desafiante ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 ou 2 // gera 3 resultador
            switch(vencedor) { //switch = estrutura escolha
                case 0: //empate
                    System.out.println(" Empatou ");
                    System.out.println("---------------------------------------------");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //desafiado vence
                    System.out.println(" Vitoria do " + this.desafiado.getNome());
                    System.out.println("---------------------------------------------");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //desafiando vence
                    System.out.println(" Vitoria do " + this.desafiante.getNome());
                    System.out.println("---------------------------------------------");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }
    
    //Metodos especiais:

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
