package cursojava.aula17_exercicios_aula_16_e_17;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		// 18 - Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.

		Scanner t = new Scanner(System.in);
		int[] numeros = new int[5];
		int menorValor = 0, maiorValor = 0, soma = 0;
		System.out.println("Informe 10 números:");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o " + (i + 1) + "º número:");
			numeros[i] = t.nextInt();
			if (numeros[i] >= maiorValor) {
				maiorValor = numeros[i];
			}
			if (numeros[i] <= menorValor || numeros[i] == 0 || numeros[0] == numeros[i]) {

				menorValor = numeros[i];

			}

			soma += numeros[i];

		}
		System.out.println("Maior valor: " + maiorValor);
		System.out.println("Menor valor: " + menorValor);
		System.out.println("Soma dos valores: " + soma);

	}

}
