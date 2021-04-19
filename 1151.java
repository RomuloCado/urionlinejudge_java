//Exercício 1151

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitura = new Scanner(System.in);
        int numero = leitura.nextInt();
        int primeiro = 0;
        int segundo = 1;
        int terceiro = 0;
        
        for(int i = 0; i < numero; i++){
            if (i == numero - 1){
                System.out.printf("%d\n", primeiro);
            }else{
                System.out.printf("%d ", primeiro);
                terceiro = segundo;
                segundo = primeiro;
                primeiro = segundo + terceiro;
            }  
        }     
    }
}
