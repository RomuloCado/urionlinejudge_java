//Exercício 1242

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String rna;
        while ((rna = leitura.readLine()) != null) { // leitura ate o EOF
            int ligacoes = 0;
            char[] rnaChar = rna.toCharArray(); // passa a strinf para um array de char
            Stack<Byte> pilha = new Stack<>(); // este array de char vai ser colocado em uma pilha para verificacao de conexoes

            for (int i = 0; i < rna.length(); i++) {
                if (!pilha.empty() && conexao((byte) rnaChar[i], pilha.peek())) {
                    ligacoes++; // condicao para haver uma conexao é a funcao retornar true e a pilha nao estar vazia
                    pilha.pop(); // retira o primeiro elemento da pilha
                } else {
                    pilha.push((byte) rnaChar[i]); // adiciona o char[i] na pilha
                }
            }
            System.out.println(ligacoes);
        }
    }

    public static boolean conexao(byte a, byte b) {
        return (a == 'B' && b == 'S') || (b == 'B' && a == 'S') || (a == 'C' && b == 'F') || (b == 'C' && a == 'F'); //retorna se existe a conexao ou nao 
    }
}
