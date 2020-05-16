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

		Boolean apto = classificacao.equals("L") ||
			(classificacao.equals("PA") && idade >= 12) ||
			(classificacao.equals("AD") && idade >= 14) ||
			(classificacao.equals("MI") && idade >= 18);

		if (apto == true) {
			System.out.println("OK, você está apto a ver este filme.");
		} else {
			System.out.println("Desculpe, este título não está disponível para a sua idade.");
		}

		sc.close();
	}

}
