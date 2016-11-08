package br.com.projedata.grupodeestudos.entidades;

public class ProdutorRural extends Fisica {

	private String inscricaoRural;

	public String getInscricaoRural() {
		return inscricaoRural;
	}

	public void setInscricaoRural(String inscricaoRural) {
		this.inscricaoRural = inscricaoRural;
	}

	public ProdutorRural(String nome, String endereco, String telefone, String cpf, String inscricaoRural) {
		super(nome, endereco, telefone, cpf);
		this.inscricaoRural = inscricaoRural;
	}

	public ProdutorRural() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProdutorRural(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone, cpf);
		// TODO Auto-generated constructor stub
	}

	public void imprimeCadastro() {

		System.out.println("** Produtor Rural \n Nome: " + getNome() + "\n CPF: " + getCpf() + "\n Endereco: "
				+ getEndereco() + "\n Telefone: " + getTelefone() + "\n Inscrição Rural: " + getInscricaoRural());

	}

}
