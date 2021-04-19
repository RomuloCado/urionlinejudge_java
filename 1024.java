//Exercício 1024

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    static BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));
    static Scanner scanner = new Scanner(System.in, "UTF-8");
    
    public static void main(String[] args) throws IOException {
           
        int numeroTeste = Integer.parseInt(leitura.readLine());
        
        List<String> listaTexto = new ArrayList()  ;
        
        for(int i = 0; i < numeroTeste; i++){
            String texto = leitura.readLine();
            listaTexto.add(texto);
        }
        
        for(int j = 0; j < numeroTeste; j++){
            passaArray(listaTexto.get(j));
        }
        leitura.close();
    } 
    
    public static void passaArray(String s) throws IOException{
        char[] arrayChar = s.toCharArray();
        aumentaPosicoes(arrayChar);
    }
    
     public static void aumentaPosicoes(char[] c) throws IOException{ // primeira fase é aumentar os valores que forem letras
                                                   //do array em 3 posicoes da tabela ASCII
         for(int i = 0; i < c.length; i++){
             
             if(c[i] >= 'A' && c[i] <= 'Z' || c[i] >= 'a' && c[i] <= 'z'){ //posicoes da tabela ASCII que sao somente letras
                 c[i] += (char) 3;
             }
         }
        inverterPosicao(c);
    }
     
     public static void inverterPosicao(char[] c) throws IOException{ // segunda fase eh inverter as posicoes de cada char
         
         for(int i = 0, j = c.length - 1 ; i < c.length/2; i++, j--){
             char aux = c[j];
             c[j] = c[i];
             c[i] = aux;
             
         }
         voltarPosicoesMetade(c);
     }
     
     public static void voltarPosicoesMetade(char[] c) throws IOException{ // terceira fase eh voltar uma posicao da tabela ASCII da primeira metade de chars do array
         for(int i = c.length/2; i < c.length; i++){
             c[i]--;
         }
         System.out.println(c);   
     }
         
}
