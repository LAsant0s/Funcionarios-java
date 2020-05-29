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
		
		do {
			System.out.print("Nome: ");
			nome = sc.next(); 
			
			System.out.print("Horas trabalhadas: ");
			horasTrab = sc.nextInt(); 
			while(horasTrab < 0) {
				System.out.print("Valores negativos nao sao aceitos. Insira novamante: ");
				horasTrab = sc.nextInt();
			}
			
			System.out.print("Valor por hora: ");
			valorPorHora = sc.nextDouble(); 
			while(valorPorHora < 0) {
				System.out.print("Valores negativos nao sao aceitos. Insira novamente: ");
				valorPorHora = sc.nextDouble();
			}
			
			System.out.print("Digitar outro (S/N)? ");
			opcao = sc.next().charAt(0); 
		}while(opcao != 'N');
	}
}