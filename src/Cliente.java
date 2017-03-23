

public class Cliente {
	private String nome;
	private int idade;
	/**
	 * @param nome
	 * @param idade
	 */
	public Cliente(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	/**
	 * @return the nome
	 */
	 
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}
	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente: "+getNome() +" "+"Idade: " +getIdade();
	}

}