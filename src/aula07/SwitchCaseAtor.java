package aula07;

import java.util.Scanner;

public class SwitchCaseAtor {

	public static void main(String[] args) {
		int condicao = 0;
		String frase = "";

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o nº do ator mais bonito");
		System.out.println("[1] Danny DeVito");
		System.out.println("[2] Timothy Spall");
		System.out.println("[3] Rob Scheider");

		condicao = scan.nextInt();

		switch (condicao) {
			case 1:
				frase += "Você vai casar com o pinguim do bátma";
				break;
			case 2:
				frase += "Você vai ter a lkua de mel com um rato traíra";
				break;
			case 3:
				frase += "Vc vai pegar uma dst de um gigolô por acidente";
				break;
			default:
				frase += "é disso pra 'melhor'";
				break;
		}

		System.out.println(frase);

	}

}
