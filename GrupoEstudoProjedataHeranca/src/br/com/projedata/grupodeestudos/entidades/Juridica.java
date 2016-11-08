package br.com.projedata.grupodeestudos.entidades;

public class Juridica extends Pessoa {

	private String cnpj;
	private String incricaoEstadual;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIncricaoEstadual() {
		return incricaoEstadual;
	}

	public void setIncricaoEstadual(String incricaoEstadual) {
		this.incricaoEstadual = incricaoEstadual;
	}

	public Juridica(String cnpj, String incricaoEstadual) {
		super();
		this.cnpj = cnpj;
		this.incricaoEstadual = incricaoEstadual;
	}

	public Juridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Juridica(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	public void imprimeCadastro() {

		System.out.println("** Jurídica \n Nome: " + getNome() + "\n CNPJ: " + getCnpj() + "\n IE: " + getIncricaoEstadual()
				+ "\n Endereco: " + getEndereco() + "\n Telefone: " + getTelefone());

	}

}
