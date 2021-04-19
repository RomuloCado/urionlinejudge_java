//Exercício 1176

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner leitura = new Scanner(System.in);
            
        int numeroVezes = leitura.nextInt();
        int contador = 0;
        
        while(contador != numeroVezes){
            int numeroFibo = leitura.nextInt();
            fibo(numeroFibo);
            contador++;
        }
                                    
    }   
    
    public static PrintStream fibo(int numero){
       long primeiro = 0;
       long segundo = 1;
       long terceiro = 0;
       
       List<Long> fibonacci = new ArrayList();
               
       for(int i = 0; i<61; i++){
           fibonacci.add(primeiro);
           terceiro = segundo;
           segundo = primeiro;
           primeiro = segundo + terceiro;
       }
       
       return System.out.printf("Fib(%d) = %d\n", numero, fibonacci.get(numero));    
    }
}
