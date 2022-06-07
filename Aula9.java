package aula9;

public class Aula9 {

    public static void main(String[] args) {
        pessoa[] p = new pessoa[2];
        livro[] l = new livro[3];
        
        p[0] = new pessoa("Pedro", 22, "M");
        p[1] = new pessoa("Maria", 25, "F");
        
        l[0] = new livro("Apredendo Java", "José", 800, p[0]);
        l[0] = new livro("Apredendo Cobol", "Fausto", 200, p[1]);
        l[0] = new livro("Apredendo Php", "Guanabara", 450, p[0]);
        
        l[0].abrir();
        l[0].folhear(500);
        System.out.println(l[0]);
        
    }
    
}
