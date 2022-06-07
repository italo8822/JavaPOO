package aula5;

public class Aula5 {    
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1000);
        p1.SetDono("ítalo");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1001);
        p2.SetDono("Roger");
        p2.abrirConta("CP");
        
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        
        //p1.fecharConta();
        p1.sacar(151); //saldo insuficiente para saque 
        p1.sacar(150);
        p1.fecharConta(); //conta fechada com sucesso "status false"
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
