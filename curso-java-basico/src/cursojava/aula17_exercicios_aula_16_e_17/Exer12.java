package cursojava.aula17_exercicios_aula_16_e_17;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
//		12 - Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele 
//		deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
//			Tabuada de 5:
//			5 X 1 = 5
//			5 X 2 = 10
//			...
//			5 X 10 = 50
		
		Scanner t = new Scanner(System.in);
		int numero;
		System.out.println("Informe um número entre 1 e 10: ");
		numero = t.nextInt();
		for(int i = 0; i<=10;i++) {
			
			System.out.println(numero + " X " + i + " = " + numero*i);
		}

	}

}
