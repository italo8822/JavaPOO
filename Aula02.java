package aula02;

public class Aula02 {
    public static void main(String[] args) {
        CanetaJava c1 = new CanetaJava();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada(); // ou c1.destampar(); 
        
        c1.status();
        c1.rabiscar(); // se estives destampada, pode rabiscar
        
        CanetaJava c2 = new CanetaJava();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        
        c2.status();
        c2.rabiscar();
    }
    
}
