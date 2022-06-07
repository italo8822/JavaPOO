public class Aula4 {
  
  /*
    public static int fatorial(int n){
      int retorno = 1;
      for(int i = n; i > 1; i--) {
        retorno = retorno * i;    
      }
      return retorno;
    }
    */
  
    
    public static int fatorial(int n){
      if (n == 1) {
        return n;
      } else {
        return n * fatorial(n - 1);
      }
    }
    
    public static int fibonacci(int n) {
      if (n == 1 || n == 0) {
        return n;
      } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
      }
    }
    
    public static void main(String[] args) {
    
    //  for(int i = 1; i < 6; i++) {
    //    System.out.println(Calculadora.fatorial(i));
    //  }
      System.out.println(Aula4.fibonacci(5));

    }
}

public class TorreHanoi {
  
    public static int quant = 0;
  
    public static void resolverTorre(int discos, int pinoOrigem, int pinoDest, int pinoTemp) {
      quant++;
    
      if (discos == 1){
        System.out.printf("%n%d ---> %d", pinoOrigem, pinoDest);
        
      } else {
        resolverTorre(discos - 1, pinoOrigem, pinoTemp, pinoDest);
        
        System.out.printf("%n%d ---> %d", pinoOrigem, pinoDest);
        
        resolverTorre(discos - 1, pinoTemp, pinoDest, pinoOrigem);
      }
      
      
      
    }
    
    public static void main(String[] args) {
      int pinoInicio = 1;
      int pinoDestino = 3;
      int pinoTemporario = 2;
      int discos = 5;
      
      resolverTorre(discos, pinoInicio, pinoDestino, pinoTemporario);
      System.out.print(quant);
    }
}