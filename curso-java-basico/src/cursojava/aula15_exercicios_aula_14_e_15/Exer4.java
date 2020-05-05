package cursojava.aula15_exercicios_aula_14_e_15;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		// 4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

		Scanner t = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		String letra = t.next();

		switch (letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("É vogal");
			break;
		default:
			System.out.println("É consoante");
		}

	}

}
