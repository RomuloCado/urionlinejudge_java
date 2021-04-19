//Exercício 1161

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner leitura = new Scanner(System.in);
        while(leitura.hasNext()){
            
            long m = leitura.nextInt();
            long n = leitura.nextInt();

            long fatorialM = Fatorial(m);
            long fatorialN = Fatorial(n);

            System.out.printf("%d\n", fatorialM + fatorialN);
        }
    }
    
    public static long Fatorial(long numero){
        if(numero == 0){
            return 1;
        }else{
            long fatorial = numero;
            for(long i = numero - 1; i >= 1; i--){
                fatorial *= i;
            }
            return fatorial;
        }    
    }
}
