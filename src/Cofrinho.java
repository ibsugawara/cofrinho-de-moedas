import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
		System.out.println("Quantia adicionada.");
	}

	public void remover(Moeda moeda) {
		listaMoedas.remove(moeda);
		System.out.println("Quantia removida.");
	}

	public void listagemMoedas() {
		if (listaMoedas.size() == 0) {
			System.out.println("O cofrinho está vazio, adicione uma moeda.");
		} else {
			for (Moeda m : listaMoedas)
				m.info();
		}
	}

	public double totalConvertido() {
		double total = 0;
		for (Moeda m : listaMoedas) {
			total += m.converter();
		}
		System.out.println("Total: R$ " + total);
		return total;

	}

	public static void exibirMenu() {
		System.out.println();
		System.out.println(" ---------------------------------- ");
		System.out.println(" |             MENU               | ");
		System.out.println(" ---------------------------------- ");
		System.out.println(" | 1 - Adicionar moedas           | ");
		System.out.println(" | 2 - Remover moedas             | ");
		System.out.println(" | 3 - Listar moedas              | ");
		System.out.println(" | 4 - Converter total em real    | ");
		System.out.println(" | 0 - Encerrar                   | ");
		System.out.println(" ---------------------------------- ");
		System.out.print(" >> ");
	}

}
