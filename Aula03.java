package aula03;
public class Aula03 {
    public static void main(String[] args) {
        CanetaJava c1 = new CanetaJava();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80; //postei esta dentro da classe que ta usando CanetaJava
        //c1.tampada = false;
        
        c1.tampar(); // to usando aqui porque privei o c1.tampada
        c1.status();
        c1.rabiscar();
    }
}