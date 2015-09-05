class Cliente {

	private String nomeCliente;
	private int cpfCliente;
	private int numeroComprasPainel;
	private int numeroComprasPeca;
	private boolean painel;
	private boolean peca;


	public void Cliente () {

		nomeCliente = null;
		cpfCliente = 0;
		numeroComprasPeca = 0;
		numeroComprasPainel = 0;
		painel = false;
		peca = false;

	}

	public String getNome() {

		return nomeCliente;
	}

	public void setNome(String nome) {

		this.nomeCliente = nome;
	}
}