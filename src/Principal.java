import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opção;

		Cofrinho cofrinho = new Cofrinho();

		Cofrinho.exibirMenu();
		opção = sc.nextInt();

		Moeda moeda;
		int valor;
		int tipoMoeda = 0;

		while (opção != 0) {
			switch (opção) {
			case 1:
				tipoMoeda = 0;
				while (tipoMoeda < 1 || tipoMoeda > 3) {
					// Adicionar moedas
					Moeda.exibirMenuMoedas();
					tipoMoeda = sc.nextInt();
					if (tipoMoeda < 1 || tipoMoeda > 3) {
						System.out.println("Opção inválida. Escolha um número de 1 a 3.");
					}
				}
				System.out.println("Qual o valor a ser adicionado?");
				valor = sc.nextInt();

				if (tipoMoeda == 1) {
					moeda = new Dolar(valor);
				} else if (tipoMoeda == 2) {
					moeda = new Euro(valor);
				} else {
					moeda = new Real(valor);
				}

				cofrinho.adicionar(moeda);
				break;

			case 2:
				// Remover moedas
				tipoMoeda = 0;
				while (tipoMoeda < 1 || tipoMoeda > 3) {

					Moeda.exibirMenuMoedas();
					tipoMoeda = sc.nextInt();
				}
				cofrinho.listagemMoedas();
				System.out.println("Insira o valor a ser removido: ");
				valor = sc.nextInt();

				if (tipoMoeda == 1) {
					moeda = new Dolar(valor);
				} else if (tipoMoeda == 2) {
					moeda = new Euro(valor);
				} else {
					moeda = new Real(valor);
				}

				cofrinho.remover(moeda);

				break;
			case 3:
				// Listar moedas
				cofrinho.listagemMoedas();
				break;
			case 4:
				// Converter em real
				cofrinho.totalConvertido();

				break;
			default:
				System.out.println("Opção inválida. Escolha um número de 0 a 4.");
			}
			// Exibir o menu novamente para manter o loop
			Cofrinho.exibirMenu();
			opção = sc.nextInt();

		}
		sc.close();
	}

}
