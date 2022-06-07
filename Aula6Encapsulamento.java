package aula6.encapsulamento;

public class Aula6Encapsulamento {
    
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        
        //c.ligar();
        //c.maisVolume(); // aumentar volume
        //c.maisVolume(); // aumenta +5
        //c.ligarMudo(); // volume cai para zero
        c.pause();
        //.play();
        c.abrirMenu();
        c.fecharMenu();
    }    
}
