//Exercício 1020

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitura = new Scanner(System.in);
        int idadeEmDias = leitura.nextInt();
        String dataConvertido = Conversor(idadeEmDias);
        System.out.printf(dataConvertido);
                   
    }
    
    public static String Conversor(int dias){
        int ano = dias/365;
        dias %= 365;
        int mes = dias/30;
        dias %= 30;
        return String.format("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dias);  
    }
}
