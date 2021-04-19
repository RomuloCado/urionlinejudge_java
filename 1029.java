//Exercício 1029

import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static int contador = 0; //variavel estatica
    
    public static void main(String[] args) throws IOException {
        
        Scanner leitura = new Scanner(System.in);
            
        int numeroVezes = leitura.nextInt();
        int auxiliar = 0;
        
        while(auxiliar != numeroVezes){
            int numeroFibo = leitura.nextInt();
            contador(numeroFibo);
            System.out.printf("fib(%d) = %d calls = %d\n", numeroFibo, contador, fibo(numeroFibo));
            auxiliar++;   
        }
                                    
    } 
    
     public static void contador(int numero){ //contador de recursoes
       int primeiro = 0;
       int segundo = 0;
       
       for(int i = 1; i < numero; i++){
            contador = primeiro + segundo + 2;
            primeiro = segundo;
            segundo = contador;
       }
       
    }
     
     public static int fibo(int numero){ 
         
         if(numero == 0){
             return 0;
         }
         if(numero == 1){
             return 1;
         }else{
             return fibo(numero - 1) + fibo(numero - 2); //onde ocorre a recursao
         }
     }
}
