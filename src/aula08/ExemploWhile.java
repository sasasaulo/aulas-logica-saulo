package aula08;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		
		int contador = 0;
		String frase = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		try {
			contador = scan.nextInt();
		}
		catch (Exception e) {
			System.out.println("Digite apenas números");
		}
		
		
		System.out.println(contador);

	}

}
