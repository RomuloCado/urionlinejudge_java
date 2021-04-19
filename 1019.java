//Exercício 1019

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitura = new Scanner(System.in);
        int segundos = leitura.nextInt();
        String valorConvertido = Conversor(segundos);
        System.out.printf(valorConvertido);
                   
    }
    
    public static String Conversor(int segundos){
        int hora = segundos/3600;
        segundos %= 3600;
        int minuto = segundos/60;
        segundos %= 60;
        return String.format("%d:%d:%d\n", hora, minuto, segundos);  
    }
}
