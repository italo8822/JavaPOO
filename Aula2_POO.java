/*public class Aula2_POO {
    
//}

/*
Escreva uma classe chamada de Calculadora que possui dois atributos inteiros. 
E uma main que instancie essa classe e realize a soma, produto, diferença e quociente dos seus atributos.
*/

class Calculadora {

	//int inteiro1; //modificador de acesso Default
	//int inteiro2; //modificador de acesso Default

	private int inteiro1; //modificador de acesso private
	private int inteiro2; //modificador de acesso private

	public void setInteiro1(int valor) { //método sem retorno e com parâmetro do int 
		 inteiro1 = valor;
	}

	public void setInteiro2(int valor) { //método sem retorno e com parâmetro do int 
		 inteiro2 = valor;
	}

	public int getInteiro1() { //método com retorno e sem parâmetro 
		return inteiro1;
	}

	//soma
	public void soma() { //método sem retorno e sem parâmetro 
		System.out.println("Soma: " + (inteiro1 + inteiro2));
	}

	//produto
	public int produto(){ //método com retorno e sem parâmetro 
		return inteiro1*inteiro2;
	}

	//subtracao

	//quociente
}

class main {  
	
	public static void main(String args[]) { 
		
		Calculadora c;
		c = new Calculadora(); // instanciação de uma classe 
		//c.inteiro1 = 10; //acesso direto a atributos quando estes são permitidos
		//c.inteiro2 = 5;
		c.setInteiro1(10); //acessando um método e passando parâmetro
		c.setInteiro2(5);


		c.soma(); //acessando um método e sem parâmetro
		int p = c.produto(); //acessando um método sem parâmetro e com retorno de um inteiro
		System.out.println("Produto: " + p);
		System.out.println("Inteiro 1: " + c.getInteiro1());
		/* 
		Calculadora c2 = new Calculadora();
		c2.inteiro1 = 1000;
		c2.inteiro2 = 3;

		c2.soma();
		*/
		/*
		System.out.println("Produto: " + (c.inteiro1*c.inteiro2));
		System.out.println("Diferença: " + (c.inteiro1-c.inteiro2));
		System.out.println("Quociente: " + (c.inteiro1/c.inteiro2));
		*/
	} 
}
