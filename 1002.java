// Exercicio 1002

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        
        Scanner leitura = new Scanner(System.in);
        double raio = leitura.nextDouble();
        double area = 3.14159 * Math.pow(raio, 2);
        System.out.printf("A=%.4f\n", area);
                
        
    }
}
