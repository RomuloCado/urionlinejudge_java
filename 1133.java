//Exercício 1133

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitura = new Scanner(System.in);
        int x = leitura.nextInt();
        int y = leitura.nextInt();
        
        if (x > y){
            int auxiliar = x;
            x = y;
            y = auxiliar;
        }
        
        for(int i = x + 1; i < y; i++){
            if (i % 5 == 2 || i % 5 == 3){
                System.out.printf("%d\n", i);
            }
        }
    }
}
