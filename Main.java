import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a sua idade: ");
		int idade = sc.nextInt();

		System.out.println();
		System.out.println("                   Classificação indicativa                    ");
		System.out.println("===============================================================");
		System.out.println("        Para a classificação LIVRE, digite (1).");
		System.out.println("        Para a classificação PRÉ ADOLESCENTE, digite (2).");
		System.out.println("        Para a classificação ADOLESCENTE, digite (3).");
		System.out.println("        Para a classificação MAIOR, digite (4).");
		System.out.println("        Para sair, digite (0)");
		System.out.println("===============================================================");
		System.out.print("Informe a classificação do filme desejada: ");
		String classificacao = sc.next();

		System.out.println();

		if (idade < 12 && classificacao.equals("L")) {
			System.out.println("OK, você está apto a ver este filme.");
		} else if (idade < 12 && classificacao.equals("PA")) {
			System.out.println("Desculpe, este título não está disponível para a sua idade.");
		} else if (idade < 12 && classificacao.equals("AD") {
			System.out.println("Desculpe, este título não está disponível para a sua idade.");
		} else if (idade < 12 && classificacao.equals("MI")) {
			System.out.println("Desculpe, este título não está disponível para a sua idade.");
		} else if (idade >= 12 && classificacao.equals("L")) {
			System.out.println("OK, você está apto a ver este filme.");
		} else if (idade >= 12 && classificacao.equals("PA")) {
			System.out.println("OK, você está apto a ver este filme.");
		} else if (idade < 14 && classificacao.equals("AD") {
			System.out.println("Desculpe, este título não está disponível para a sua idade.");
		} else if (idade < 14 && classificacao.equals("MI") {
			System.out.println("Desculpe, este título não está disponível para a sua idade.");
		} else if (idade >= 14 && classificacao.equals("L")) {
			System.out.println("OK, você está apto a ver este filme.");
		} else if (idade >= 14 && classificacao.equals("PA")) {
			System.out.println("OK, você está apto a ver este filme.");
		} else if (idade >= 14 && classificacao.equals("AD")) {
			System.out.println("OK, você está apto a ver este filme.");
		} else if (idade < 18 && classificacao.equals("MI")) {
			System.out.println("Desculpe, este título não está disponível para a sua idade.");
		} else if (idade >= 18) {
			System.out.println("OK, você está apto a ver este filme.");
		} else {
			System.out.println("===========================================================");
			System.out.println("Muito obrigado!");
		}

		sc.close();
	}

}
