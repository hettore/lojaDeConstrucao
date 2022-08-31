package entities;

public class Casa {

	private int id;

	private int sala;
	private int quarto;
	private int quartoComSuite;
	private int banheiro;
	private int cozinha;
	
	private String quintal;
	private int vagaCarro;
	private double valor;

	public Casa() {
		super();
	}

	public Casa(int id, int sala, int quarto, int quartoComSuite, int banheiro, int cozinha,
			String quintal, int vagaCarro, double valor) {
		super();
		this.id = id;
		this.sala = sala;
		this.quarto = quarto;
		this.quartoComSuite = quartoComSuite;
		this.banheiro = banheiro;
		this.cozinha = cozinha;
		this.quintal = quintal;
		this.vagaCarro = vagaCarro;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	public int getBanheiro() {
		return banheiro;
	}

	public void setBanheiro(int banheiro) {
		this.banheiro = banheiro;
	}

	public int getCozinha() {
		return cozinha;
	}

	public void setCozinha(int cozinha) {
		this.cozinha = cozinha;
	}

	public String getQuintal() {
		return quintal;
	}

	public void setQuintal(String quintal) {
		this.quintal = quintal;
	}

	public int getVagaCarro() {
		return vagaCarro;
	}

	public void setVagaCarro(int vagaCarro) {
		this.vagaCarro = vagaCarro;
	}

	public int getQuartoComSuite() {
		return quartoComSuite;
	}

	public void setQuartoComSuite(int quartoComSuite) {
		this.quartoComSuite = quartoComSuite;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Casa " + id + "\n");
		sb.append(sala + " sala, \n");
		sb.append(quarto + " quarto(s),\n");
		sb.append("Sendo: " + quartoComSuite + " quarto(s) com suíte,\n");
		sb.append(banheiro + " banheiro,\n");
		sb.append(cozinha + " cozinha,\n");
		sb.append("Quintal: " + quintal + ",\n");
		sb.append("Vaga(s) para carro: " + vagaCarro + ".\n");
		return sb.toString();
	}

}
