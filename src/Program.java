import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		int horasTrab;
		double valorPorHora;
		char opcao;
		int opcaoMenu;

		//Leitura dos dados
		do {
			System.out.print("Nome: ");
			nome = sc.next();

			System.out.print("Horas trabalhadas: ");
			horasTrab = sc.nextInt();
			while (horasTrab < 0) {
				System.out.print("Valores negativos nao sao aceitos. Insira novamante: ");
				horasTrab = sc.nextInt();
			}

			System.out.print("Valor por hora: ");
			valorPorHora = sc.nextDouble();
			while (valorPorHora < 0) {
				System.out.print("Valores negativos nao sao aceitos. Insira novamente: ");
				valorPorHora = sc.nextDouble();
			}

			System.out.print("Digitar outro (S/N)? ");
			opcao = sc.next().charAt(0);
		} while (opcao != 'N');
		
		// Menu repetindo
		do {
			System.out.println();
			System.out.println("Menu");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opcao: ");
			opcaoMenu = sc.nextInt();

			System.out.println();

			switch (opcaoMenu) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					System.out.println("FIM DO PROGRAMA!");
					break;
				default:
					break;
			}
		} while (opcaoMenu != 4);

	}
}