package fichadecadastro_teste;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fichadecadastro_teste {
    
    private static String nome;
    private static int idade;
    private static float altura;
    private static float peso;
    private static char sexo;
    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        do{
        System.out.println("Digite seu nome: ");
        nome = leitura.nextLine(); //metodo para receber String
        } while (nome.length() < 6 || nome.length() > 100); // para priva numero de caracteres
        
        do{
        System.out.println("Digite sua idade: ");
        idade = leitura.nextInt(); //tipo inteiro 
        } while (idade <= 18 || idade >= 65);
        
        do{
            System.out.println("Digite sua altura: ");
            altura = leitura.nextFloat();
        } while (altura <= 0);
        
        do{
            System.out.println("Digite seu peso: ");
            peso = leitura.nextFloat();
        } while (peso <= 0);
        
        do {
            try {
                System.out.println("Digite seu sexo: [F ou M]");
                sexo = (char) System.in.read();
            } catch (IOException ex) {
                Logger.getLogger(Fichadecadastro_teste.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (sexo != 'M' && sexo != 'F');
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        
    }
    
}    
