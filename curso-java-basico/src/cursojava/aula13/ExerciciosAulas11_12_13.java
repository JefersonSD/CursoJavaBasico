package cursojava.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerciciosAulas11_12_13 {

	public static void main(String[] args) {
		/*1 - Faça um Programa que mostre a mensagem "Alo mundo" na tela.

			 System.out.println("Alô mundo"); 

		 2 - Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

			Scanner t = new Scanner(System.in); 
			System.out.println("Digite um número: ");
			int num = t.nextInt(); 
			System.out.println("O número digitado foi: " + num);
			 
		 3 - Faça um Programa que peça dois números e imprima a soma.

			Scanner t = new Scanner(System.in);
			System.out.println("Digite o 1º número: ");
			int num1 = t.nextInt();
			System.out.println("Digite o 2º número: ");
			int num2 = t.nextInt();
			System.out.println("A soma dos números é = a: " + (num1 + num2));
			
		 4 - Faça um Programa que peça as 4 notas bimestrais e mostre a média.
			
			Scanner t = new Scanner(System.in);
			System.out.println("Digite a 1ª nota: ");
			double nota1 = t.nextDouble();
			System.out.println("Digite o 2ª nota: ");
			double nota2 = t.nextDouble();
			System.out.println("Digite a 3ª nota: ");
			double nota3 = t.nextDouble();
			System.out.println("Digite o 4ª nota: ");
			double nota4 = t.nextDouble();
			
			System.out.printf("A média das notas é = a: %.2f %n ", (nota1+nota2+nota3+nota4)/4);
			
		 5 - Faça um Programa que converta metros para centímetros.
		
			 double metros = 10, converteC;
			 converteC = metros*100;
			 System.out.println(metros + " metro(s) equivale(m) a " + converteC + " centímetro(s)");
			 
		  6 - Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		
			 Scanner t = new Scanner(System.in);
			 System.out.println("Digite o raio do círculo: ");
			 double raio = t.nextDouble();
			 double area = Math.PI*Math.pow(raio, 2);
			 System.out.printf("O cálculo da área cujo o raio é " + raio + " é igual a %.3f %n", area);
			 
		  7 - Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
		
			 Scanner t = new Scanner (System.in);
			 System.out.println("Informe a base do quadrado: ");
			 double base = t.nextDouble();
			 double area = Math.pow(base, 2) * 2;
			 String i = "qualquer";
			 System.out.printf("O dobro da área do quadrado é igual a: %.3f%n ",area);
			 
		  8 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas 
		  	  trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.	 
			 
			  Scanner t = new Scanner (System.in);
			  DecimalFormat f = new DecimalFormat("0,000.00");
			  System.out.println("Qual o seu nome?: ");
			  String nome = t.next();
			  System.out.println(nome + "!" + " quanto você ganha por hora?: ");
			  double valorHora = t.nextDouble();
			  System.out.println("Quantas horas você trabalha por mês? ");
			  double horas = t.nextDouble();
			  double salario = valorHora*horas;
			  System.out.println(nome + " você ganha " + f.format(salario) + " por mês!");
			  
		   9 - Faça um Programa que peça a temperatura em graus Farenheit, transforme e 
		   	   mostre a temperatura em graus Celsius.C = (5 * (F-32) / 9).
			  */
			
		 	   Scanner t = new Scanner (System.in);
		 	   System.out.println("Digite a temperatura em graus Farenheit: ");
		 	   double f = t.nextDouble();
		 	   double celcius = (f-32)/1.8; // para transformar Celcius em Fareheit utilize a formula °F=°C×1,8+32
		 	   System.out.println("A temperatura " + f + " em graus Farenheit, corresponde a temperatura " + celcius + " em graus Celcius.");
		 	   
	
	}	

}
