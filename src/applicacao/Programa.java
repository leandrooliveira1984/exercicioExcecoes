package applicacao;

import java.util.Scanner;

import modelo.entidade.Conta;
import modelo.excecao.DominioExcecao;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("EXERCICIO EXCE��O CONTA BANC�RIA");
		System.out.println("Digite os dados da Conta.");
		System.out.print("N�mero: ");
		int numero = sc.nextInt();
		System.out.print("T�tular: ");
		sc.next();
		String titular = sc.nextLine();
		System.out.print("Saldo Inicial: ");
		Double saldo = sc.nextDouble();
		System.out.print("Limite de Saque: ");
		Double limiteSaque = sc.nextDouble();

		Conta conta = new Conta(numero, titular, saldo, limiteSaque);
		System.out.println();

		System.out.print("Digite o valor do saque: ");
		Double quantidade = sc.nextDouble();

		try {
			conta.Saque(quantidade);
			System.out.printf("Saldo Atualizado: R$ %.2f \n", conta.GetSaldo());
		} catch (DominioExcecao e) {
			System.out.println("Transa��o inv�lida - " + e.getMessage());
		}

		sc.close();
	}

}
