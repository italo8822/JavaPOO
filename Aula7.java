package aula7;

public class Aula7 {

    public static void main(String[] args) {
        Lutador l[]= new Lutador[6];
                
        l[0] = new Lutador("Lucas", "França", 29, 1.75f,
                          68.9f, 11, 2, 1);//nome, nacionalidade, idade, altura, peso, vitorias, derrotas, empates
        
        l[1] = new Lutador("João", "Brasil", 35, 1.70f,
                          72.9f, 9, 2, 3);
        
        l[2] = new Lutador("Breno", "Africa", 31, 1.65f,
                          75.9f, 5, 5, 4);
        
        l[3] = new Lutador("Jeff", "Eua", 32, 1.62f,
                          86.9f, 5, 4, 5);
                
        l[4] = new Lutador("Boy", "Canada", 30, 1.73f,
                          95.9f, 1, 9, 4);
        
        l[5] = new Lutador("anderson", "Alemanhã", 28, 1.79f,
                          114.9f, 14, 0, 0);
        
        //l.apresentar();
        //l[3].status();
        //l[3].setPeso(111f);
        //l[3].status();
        
        Luta UEC01 =  new Luta();
        UEC01.marcarLuta(l[1], l[2]);
        UEC01.lutar();
        l[1].status();
        l[2].status();
    }
    
}
