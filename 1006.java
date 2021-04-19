//Exercício 1006

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        
        Scanner leitura = new Scanner(System.in);
        double a = leitura.nextDouble();
        double b = leitura.nextDouble();
        double c = leitura.nextDouble();
        double media = (a * 2 + b * 3 + c * 5)/10;
        System.out.printf("MEDIA = %.1f\n", media);
                
    }
}
