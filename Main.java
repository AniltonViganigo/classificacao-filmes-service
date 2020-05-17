import java.util.Scanner;

public class Main {
		private static final String mensagemOk = "Ok, você está apto a ver esse filme.";
		private static final String mensagemNOk = "Desculpe, este título não está disponível para a sua idade.";
		
		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a sua idade: ");
		int idade = sc.nextInt();

		System.out.println();
		System.out.println("                   Classificação indicativa                    ");
		System.out.println("===============================================================");
		System.out.println("        Para a classificação LIVRE.('L')                       ");
		System.out.println("        Para a classificação PRÉ ADOLESCENTE. ('PA').          ");
		System.out.println("        Para a classificação ADOLESCENTE. ('AD').              ");
		System.out.println("        Para a classificação MAIOR. ('MI').                    ");
		System.out.println("        Para sair, digite 'S'.                                 ");
		System.out.println("===============================================================");
		System.out.print("Informe a classificação do filme desejada: ");
		String classificacao = sc.next();
		
		if (classificacao.equals("S")) {
			System.out.println();
			System.out.println("Programa encerrado!");
			System.exit(0);
		}

		System.out.println();

		Boolean apto = classificacao.equals("L") ||
			(classificacao.equals("PA") && idade >=12) ||
			(classificacao.equals("DA") && idade >=14) ||
			(classificacao.equals("MI") && idade >=18); 

		if (apto == true) {
			System.out.println(mensagemOk);
		}
		else {
			System.out.println(mensagemNOk);
		}

		

		sc.close();
	}  
}

