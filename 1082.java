//Exercício 1082

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {

    static BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int numeroCaso = 1, numeroVezes = lerInteiro(), primeiro, segundo, s, d, conexoes;
        int[] arrayUsuario;
        int[][] matrizChar;
        String texto;
        while (numeroVezes-- > 0) {
            arrayUsuario = lerArray();
            primeiro = arrayUsuario[0];
            segundo = arrayUsuario[1];
            matrizChar = new int[primeiro][primeiro];
            while (segundo-- > 0) {
                texto = leitura.readLine();
                s = (int) texto.charAt(0) - 97;
                d = (int) texto.charAt(2) - 97;
                matrizChar[s][d] = 1;
                matrizChar[d][s] = 1;
            }
            conexoes = 0;
            System.out.printf("Case #%d:\n", numeroCaso++);
            for (int i = 0; i < primeiro; i++) {
                TreeSet<Integer> treeSet = new TreeSet<>(); //set para ordenar os elementos adicionados
                treeSet.add(i);
                treeSet = getConexoes(treeSet, matrizChar, i, 0);
                if (!treeSet.isEmpty()) {
                    conexoes++;
                    for (Integer next : treeSet) {
                        System.out.print((char) (next + 97) + ",");
                    }
                    System.out.println();
                }
            }
            System.out.printf("%d connected components\n", conexoes);
            System.out.println();
        }
        System.out.close();
    }


    private static int lerInteiro() throws IOException { // trasnformar a string em inteiro
        return Integer.parseInt(leitura.readLine());
    }

    private static int[] lerArray() throws IOException { //separar os chars da string 
        String[] line = leitura.readLine().split("\\s");
        int l = line.length;
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = Integer.parseInt(line[i]);
        }
        return a;
    }
    
    private static TreeSet<Integer> getConexoes(TreeSet<Integer> treeSet, int[][] matriz, int i, int p) { //calcular o numero de conecoes dos casos
        boolean temConexao = false;
        int semConexao = 0;
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] == 1) {
                temConexao = true;
                matriz[i][j] = 2;
                matriz[j][i] = 2;
                treeSet.add(j);
                treeSet = getConexoes(treeSet, matriz, j, p+ 1); //recursao das conexoes
            } else if (matriz[i][j] == 0) {
                semConexao++;
            }
        }
        if (!temConexao && semConexao < matriz[i].length && p == 0) { //remocao dos elementos sem a conexao
            treeSet.remove(i);
        }
        return treeSet;
    }
}
