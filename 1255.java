//Exercício 1255

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays; 

public class Main {

    static BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String numero = leitura.readLine();
        int numeroTestes = Integer.parseInt(numero);
        int frequenciaLetras = 0, tamanho;
        String entradaUsuario, resultado;
        int[] numeroLetras = new int[26];
        while (numeroTestes-- > 0) { // laço para ler os textos ou palavras do usuario
            entradaUsuario = leitura.readLine();
            entradaUsuario = entradaUsuario.toLowerCase(); 
            frequenciaLetras = 0;
            Arrays.fill(numeroLetras, 0); // iniciar o array de numero de letras do texto com 0 
            tamanho = entradaUsuario.length(); //pegando o tamanho da string
            verificaMaiorFrequencia(tamanho, frequenciaLetras, entradaUsuario, numeroLetras); // chamando a funcao
        }
    }

    public static void verificaMaiorFrequencia(int tamanho, int f, String usuario, int[] nl) {
        
        String resultado = "";
        char c;
        for (int i = 0; i < tamanho; i++) {
            c = usuario.charAt(i);  //separando as letras da string em char
            if (c >= 'a' && c <= 'z') { //sao desconsiderados espacos ou char especial
                nl[c - 97]++;
                if (nl[c - 97] > f) {
                    f = nl[c - 97]; //verificando a freqeuncia daquele char
                }
            }
        }
        for (int i = 0; i < 26; i++) {

            if (nl[i] == f) { // passar por todo o array de char para verificar qual teve mais frequencia
                resultado += (char) ('a' + i); // o resultado ficara em ordem alfabetica somando com 'a'
            }
        }

        System.out.println(resultado);
    }
}
