package aula07;

import java.util.Scanner;

public class ExemploScan {

	public static void main(String[] args) {
		String nome = "";
		int idade = 0;
		String sexo = "";
		
		/* Criando o objeto da classe Scanner */
		Scanner dados = new Scanner(System.in);
		
		/* Pegando o nome */
		System.out.println("Digite o seu nome: ");
		nome = dados.nextLine();
		
		/* Pegando a idade */
		System.out.println("Digite a sua idade: ");
		//idade = dados.nextInt();
		idade = Integer.parseInt(dados.nextLine());
		
		
		/* Pegando o sexo */
		System.out.println("Digite o seu sexo: ");
		sexo = dados.nextLine();
		
		// Saída
		System.out.println(nome + " tem " + idade + " anos e é do sexo " + sexo);
		
		dados.close();

	}

}
