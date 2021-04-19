//Exercício 1166

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String vez = leitura.readLine();
        int numeroVezes = Integer.parseInt(vez);
        for (int i = 0; i < numeroVezes; i++) {
            
            String numero = leitura.readLine();
            int numeroDePilhas = Integer.parseInt(numero);

            Stack<Integer> pilha[] = new Stack[numeroDePilhas];
            for (int j = 0; j < numeroDePilhas; j++) {
                pilha[j] = new Stack<>();  // criar uma pilha de zero ate o numero passado pelo usuario
            }
            
            int bola = 1;
            for (int trilha = 0; trilha < numeroDePilhas;) {
                if (pilha[trilha].empty()) {
                    pilha[trilha].push(bola); // adicionar elemento na pilha caso esteja vazia
                    bola++;
                    trilha = 0;
                } else {
                    int ultimabola = pilha[trilha].peek(); // retirar o ultimo elemento da pilha
                    double soma = bola + ultimabola;  //somar esse ultimo elemento com o numero de bolas na pilha 
                    soma = Math.sqrt(soma); // calculo do quadrado perfeito
                    if (soma == (int) soma) { //se a raiz quadrada for inteira, com resto da divisao zero,somou-se um quadrado perfeito
                        pilha[trilha].push(bola); //quando encontrado o quadrado perfeito adicionar outra bola no valor 
                        bola++;
                        trilha = 0;
                    } else {
                        trilha++; //senao soma pra mais uma vareta de teste
                    }
                }
            }
            if (numeroDePilhas > 50) {
                System.out.print(-1);
                System.out.print("\n");
            } else {
                System.out.print(bola - 1);
                System.out.print("\n");
            }
        }
    }
