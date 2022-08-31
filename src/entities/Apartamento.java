package entities;

public class Apartamento extends Casa {

	private String varanda;

	public Apartamento() {
		super();
	}

	public Apartamento(int id, int sala, int quarto, int quartoComSuite, int banheiro, int cozinha, String quintal, String varanda, int vagaCarro, double valor) {
		super(id, sala, quarto, quartoComSuite, banheiro, cozinha, quintal, vagaCarro, valor);
		this.varanda = varanda;
	}

	public String getVaranda() {
		return varanda;
	}

	public void setVaranda(String varanda) {
		this.varanda = varanda;
	}

	
}
