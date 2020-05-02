package cursojava.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerciciosAulas11_12_13 {

	public static void main(String[] args) {
/*		
		//1 - Faça um Programa que mostre a mensagem "Alo mundo" na tela.

			 System.out.println("Alô mundo"); 

		//2 - Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

			Scanner t = new Scanner(System.in); 
			System.out.println("Digite um número: ");
			int num = t.nextInt(); 
			System.out.println("O número digitado foi: " + num);
			 
		//3 - Faça um Programa que peça dois números e imprima a soma.

			Scanner t = new Scanner(System.in);
			System.out.println("Digite o 1º número: ");
			int num1 = t.nextInt();
			System.out.println("Digite o 2º número: ");
			int num2 = t.nextInt();
			System.out.println("A soma dos números é = a: " + (num1 + num2));
			
		 //4 - Faça um Programa que peça as 4 notas bimestrais e mostre a média.
			
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
			
		 //5 - Faça um Programa que converta metros para centímetros.
		
			 double metros = 10, converteC;
			 converteC = metros*100;
			 System.out.println(metros + " metro(s) equivale(m) a " + converteC + " centímetro(s)");
			 
		  //6 - Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		
			 Scanner t = new Scanner(System.in);
			 System.out.println("Digite o raio do círculo: ");
			 double raio = t.nextDouble();
			 double area = Math.PI*Math.pow(raio, 2);
			 System.out.printf("O cálculo da área cujo o raio é " + raio + " é igual a %.3f %n", area);
			 
		  //7 - Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
		
			 Scanner t = new Scanner (System.in);
			 System.out.println("Informe a base do quadrado: ");
			 double base = t.nextDouble();
			 double area = Math.pow(base, 2) * 2;
			 String i = "qualquer";
			 System.out.printf("O dobro da área do quadrado é igual a: %.3f%n ",area);
			 
		  //8 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas 
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
			  
		   /*9 - Faça um Programa que peça a temperatura em graus Farenheit, transforme e 
		   	   mostre a temperatura em graus Celsius.C = (5 * (F-32) / 9).
		   	   
		 	   Scanner t = new Scanner (System.in);
		 	   System.out.println("Digite a temperatura em graus Farenheit: ");
		 	   double f = t.nextDouble();
		 	   double celcius = (f-32)/1.8; // para transformar Celcius em Fareheit utilize a formula °F=°C×1,8+32
		 	   System.out.println("A temperatura " + f + " em graus Farenheit, corresponde a temperatura " + celcius + " em graus Celcius.");
		 	   
		   //10 - Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
		 	   
				Scanner t = new Scanner (System.in);
				System.out.println("Informe a temperatura em graus Celcius: ");
				double c = t.nextDouble();
				double farenheit = (c*1.8)+32;
				System.out.println("A temperatura " + c + "em graus Celsius, corresponde a temperatura "  + farenheit + " em graus Farenheit.");
				
		   /*11 - Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
				a - o produto do dobro do primeiro com metade do segundo .
				b - a soma do triplo do primeiro com o terceiro.
				c - o terceiro elevado ao cubo.
				
		 	   	Scanner t = new Scanner(System.in);
					System.out.println("Informe 1 número inteiro: ");
					double inteiro1 = t.nextDouble();					
					System.out.println("Informe outro número inteiro: ");
					double inteiro2 = t.nextDouble();					
					System.out.println("Agora informe um número real: ");
					double real = t.nextDouble();
					double result1 = (inteiro1*2) + (inteiro2/2);
					double result2 = (inteiro1*3) + real;
					double result3 = Math.pow(real, 3);
					System.out.println("-> O produto do dobro do primeiro com metade do segundo é = a: " + result1+"\n"
					                   + "-> A soma do triplo do primeiro com o terceiro é = a: " + result2 + "\n" 
					                   + "-> O terceiro elevado ao cubo é = a: " + result3);
	       /*12 - Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule 
	        	seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
		   		
					Scanner t = new Scanner(System.in);
					System.out.println("Informe a sua altura: ");
					double altura = t.nextDouble();
					double pesoIdeal = (72.7*altura) - 58;
					System.out.printf("De acordo com a sua altura o seu peso ideal deve ser igual a: %.2f%n ",pesoIdeal);
					
		  /* 13 - Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que 
				calcule seu peso ideal, utilizando as seguintes fórmulas:
				Para homens: (72.7*h) - 58
				Para mulheres: (62.1*h) - 44.7		
				
					Scanner t = new Scanner(System.in);
					System.out.println("Informe a sua altura: ");
					double altura = t.nextDouble();
					System.out.println("Informe o seu sexo: (Digite \"M\" para masculino ou \"F\" para feminino)");
					String sexo = t.next();
					while(!sexo.equals("M") && !sexo.equals("F")) {
						System.out.println("Caractere incorreto (Digite \"M\" para masculino ou \"F\" para feminino)");
						sexo = t.next();
					}
					if(sexo.equals("M")) {
						double pesoIdeal = (72.7*altura) - 58;
						System.out.printf("Por ser do sexo masculino o seu peso ideal deve ser igual a: %.2f%n ", pesoIdeal);
					}else {
						double pesoIdeal = (62.1*altura) - 44.7;	
						System.out.printf("Por ser do sexo feminino o seu peso ideal deve ser igual a: %.2f%n ", pesoIdeal);
					}	
					
		    /*14 -  João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
				   Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo 
				   (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a
				   variável peso (peso de peixes)e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite 
				   e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
					
					
					Scanner t = new Scanner(System.in);
					System.out.println("Informe o peso total em Kg:  ");
					double peso = t.nextDouble();
					if(peso > 50) {
						double excesso = (peso-50);
						double multa = excesso*4.00;
						System.out.printf("O peso foi excedido em %.0fKg. A multa a ser paga será no valor de: R$%.2f%n ", excesso ,multa);
					}else {
						System.out.println("Peso está dentro do limite estabelecido pelo regulamento de pesca do estado de São Paulo.");
					}
					
			  /*15 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total 
			  	   do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, 
			  	   faça um programa que nos dê:
						salário bruto.
						quanto pagou ao INSS.
						quanto pagou ao sindicato.
						o salário líquido.
				   calcule os descontos e o salário líquido, conforme a tabela abaixo:
						+ Salário Bruto : R$
						- IR (11%) : R$
						- INSS (8%) : R$
						- Sindicato ( 5%) : R$
						= Salário Liquido : R$
					Obs.: Salário Bruto - Descontos = Salário Líquido.	
					
					
					Scanner t = new Scanner(System.in);
					System.out.println("Quanto você ganha por hora? : ");
					double vHora = t.nextDouble();					
					System.out.println("Quantas horas você trabalha por mês? : ");
					double horasT = t.nextDouble();
					double salarioBruto = vHora*horasT;
					double impRenda = salarioBruto*0.11;
					double INSS = salarioBruto*0.08;
					double sind = salarioBruto*0.05;
					double salLiquido = salarioBruto - impRenda - INSS - sind;
					System.out.printf(" - Salário bruto: R$%.2f%n - Desconto de IR: "
									  + "R$%.2f%n - INSS: R$%.2f%n - Sindicato: R$%.2f%n - "
									  + "Salário Líquido: R$%.2f ",salarioBruto,impRenda,INSS,
									  	sind,salLiquido);
			  /*16 - Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
				 	 Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 
				 	 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
					
					
					Scanner t = new Scanner(System.in);
					System.out.println("Informe o tamanho da área em metros quadrados a ser pintada: ");
					double area = t.nextDouble();
					
					double quantidadeTinta = (area/3)/18;
					double valor = Math.ceil(quantidadeTinta)*80;
				
					System.out.printf("Você terá que comprar %.0f lata(s) de tinta para pintar %.0f metros " +
									  "quadrados com um valor total de R$%.2f%n ",Math.ceil(quantidadeTinta) ,area,valor );
					
				17 - Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere 
					 que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 
					 ou em galões de 3,6 litros, que custam R$ 25,00.
							Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
							comprar apenas latas de 18 litros;
							comprar apenas galões de 3,6 litros;
							misturar latas e galões, de forma que o preço seja o menor. Acrescente 10% de folga e sempre arredonde 
							os valores para cima, isto é, considere latas cheias.					  
					 */
										
					 Scanner t = new Scanner(System.in);
					 System.out.println("Informe o tamanho da área em metros quadrados a ser pintada: ");
					 double area = t.nextDouble();	
					 
					 //Latas de 18 Litros
					 double tintaLata = (area/6)/18;
					 double valor = Math.ceil(tintaLata)*80;
					 
					 System.out.printf("Caso você queira comprar latas de tinta de 18 litros, "
					 				 + "Você terá que comprar %.0f lata(s) para pintar %.0f metros " +
					 				   "quadrados com um valor total de R$%.2f%n",Math.ceil(tintaLata) ,area,valor );
					 // Galões de 3,6 Litros
					 double tintaGaloes = (area/6)/3.6;
					 double valor1 = Math.ceil(tintaGaloes)*25;
					 
					 System.out.printf("Caso você queira comprar galões de tinta de 3,6 litros, "
					 				 + "Você terá que comprar %.0f galão(ões) para pintar %.0f metros " +
					 				   "quadrados com um valor total de R$%.2f%n ",Math.ceil(tintaGaloes) ,area,valor1 );
					
	}
}
