//Exercício 1063

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String vagoes;
        String[] sequencia, sequenciaUsuario;
        int numeroVagoes, numero;
        while (!(vagoes = leitura.readLine()).equals("0")) { //laco de repeticao ate ser digitado 0 como saida
            numeroVagoes = Integer.parseInt(vagoes);
            sequencia = leitura.readLine().split("\\s"); // separando os vagoes padroes
            sequenciaUsuario = leitura.readLine().split("\\s"); // separando o resultado desejado pelo usuario
            Stack<String> pilha = new Stack<>(); //criar  pilha para reorganizar os vagoes
            numero = 0;

            for (int i = 0; i < numeroVagoes; i++) {
                pilha.push(sequencia[i]);
                System.out.print("I"); // quando foi inserido um vagao na pilha
                while (pilha.size() > 0 && sequenciaUsuario[numero].equals(pilha.lastElement())) {
                    numero++;
                    pilha.pop();
                    System.out.print("R"); // quando foi retirado o vagao da pilha
                }
            }
            System.out.println(pilha.size() > 0 ? " Impossible" : ""); // se sobrar vagoes na pilha foi impossivel reorganizar
        }
        
    }
