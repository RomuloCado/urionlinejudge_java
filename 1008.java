//Exercício 1008

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitura = new Scanner(System.in);
        int numeroDoFuncionario = leitura.nextInt();
        int horasTrabalhadas = leitura.nextInt();
        double valorPorHora = leitura.nextDouble(); 
        System.out.printf("NUMBER = %d\n", numeroDoFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", Salario(horasTrabalhadas, valorPorHora));
                
    }
    
    public static double Salario(int horas, double valor){
        return horas * valor;
    }
}
