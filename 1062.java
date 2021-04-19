//Exercício 1062

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

    static BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));
    
	public static void main(String[] args) throws IOException {
		String vagoes;
		String[] dividirVagoes;
		int numeroVagoes, numero, ordemVagoes;
		boolean primeiroTeste = true;
		while (!(vagoes = leitura.readLine()).equals("0")) { //laco de repeticao ate ser digitado 0 como saida
                    numeroVagoes = Integer.parseInt(vagoes);
                    if (primeiroTeste) {
			primeiroTeste = false;
                    }else{
			System.out.println();
                    }
                    while (!(vagoes = leitura.readLine()).equals("0")) { // outro laco ate ser digitado 0 como saida
                        Stack<Integer> pilha = new Stack<>(); //organizar os vagoes em uma pilha para verificar se eh possivel a ordenacao dos vagoes
                        dividirVagoes = vagoes.split("\\s");
                        numero = 0;
                        ordemVagoes = Integer.parseInt(dividirVagoes[numero]);
                        for (int i = 1; i <= numeroVagoes; i++) {
                            pilha.push(i);                       //inserir o numero do vagao no inicio da pilha
                            while (!pilha.isEmpty() && ordemVagoes == pilha.lastElement()) {
                                if (++numero < numeroVagoes) {
                                   ordemVagoes = Integer.parseInt(dividirVagoes[numero]);
                                }
                                pilha.pop(); // retirar os vagoes da pilha
                            }
                        }
                        System.out.println(pilha.isEmpty() ? "Yes" : "No");  // se a pilha estiver vazia, que dizer que deu certo a ordenacao
                    }
		}
		System.out.println();
	}
