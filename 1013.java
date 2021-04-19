//Exercício 1013

import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitura = new Scanner(System.in);
        int a = leitura.nextInt();
        int b = leitura.nextInt();
        int c = leitura.nextInt(); 
        int maior = Maior(a, b, c);
        System.out.printf("%d eh o maior\n", maior);
                   
    }
    
    public static int Maior(int a, int b, int c){
        int maiorEntreAeB = (a + b + Math.abs(a-b))/2;
        return (maiorEntreAeB + c + Math.abs(maiorEntreAeB - c))/2;
    }
}
