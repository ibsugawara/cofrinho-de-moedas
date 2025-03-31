public abstract class Moeda {
	private double valor;

	public Moeda(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public abstract void info();

	public abstract double converter();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	public static void exibirMenuMoedas() {
		System.out.println();
		System.out.println(" ---------------------------------- ");
		System.out.println(" |     ESCOLHA UM TIPO DE MOEDA   | ");
		System.out.println(" ---------------------------------- ");
		System.out.println(" | 1 - Dólar                      | ");
		System.out.println(" | 2 - Euro                       | ");
		System.out.println(" | 3 - Real                       | ");
		System.out.println(" ---------------------------------- ");
		System.out.print(" >> ");
	}

}
