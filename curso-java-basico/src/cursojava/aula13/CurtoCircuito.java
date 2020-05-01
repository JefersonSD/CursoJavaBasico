package cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
	
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & // Verifica as duas condições e imprime
				verdadeiro;
		boolean resultado2 = falso && // Verifica somente a primeira condição e imprime
				verdadeiro;
		System.out.println(resultado1);
		System.out.println(resultado2);
		
	}

}
