//Exercício 1036

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitura = new Scanner(System.in);
        double a = leitura.nextDouble();
        double b = leitura.nextDouble();
        double c = leitura.nextDouble();
        double delta = Delta(a, b, c);
        if(a == 0 || delta < 0){
            System.out.print("Impossivel calcular\n");
        }else{
            String bhaskara = Bhaskara(a, b, c, delta);
            System.out.print(bhaskara);
        }                
    }
    
    public static double Delta(double a, double b, double c){
        return Math.pow(b, 2) - 4 * a * c;
    }
    
    public static String Bhaskara(double a, double b, double c, double delta){
        double raiz1 = ((b*-1) + Math.sqrt(delta))/(2*a);
        double raiz2 = ((b*-1) - Math.sqrt(delta))/(2*a);
        return String.format("R1 = %.5f\nR2 = %.5f\n", raiz1, raiz2);
    }
    
}
