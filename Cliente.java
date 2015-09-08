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

//Get das informações dos clientes.

	public String getNomeCliente() {

		return nomeCliente;
	}

	public int getCPF() {

		return cpfCliente;
	}

	public int getNumeroComprasPainel() {

		return numeroComprasPainel;
	}

	public int getNumeroComprasPeca() {

		return numeroComprasPeca;
	}

	public boolean getPainel() {

		return painel;
	}

	public boolean getPeca() {

		return peca;
	}

// Set das informações dos clientes

	public void setNome (String nome) {

		this.nomeCliente = nome;
	}

	public int setCPF (int cpf) {

		this.cpfCliente = cpf;
	}

	public int setNumeroCompraPainel (int comprasPainel) {

		this.numeroComprasPainel = comprasPainel;
	}

	public int setNumeroCompraPeca (int comprasPeca) {

		this.numeroComprasPeca = comprasPeca;
	}

	public boolean setPainel (int p) {

		this.painel = p;
	}

	public boolean setPeca (int pe) {

		this.peca = pe;
	}

// Salva dados no banco.

	public void SalvaCliente () {
		/*
		banco = this.nomeCliente;
		banco = this.cpfCliente;
		banco = this.numeroComprasPainel;
		banco = this.numeroComprasPeca;
		banco = this.painel;
		banco = this.peca;
		*/
	}



}