public class Real extends Moeda {
	public Real(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Real, Valor: " + getValor());
	}

	@Override
	public double converter() {
		return getValor(); // Sem necessidade de conversão
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}