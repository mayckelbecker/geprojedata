package br.com.projedata.grupodeestudos.entidades;

public class Fisica extends Pessoa {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Fisica(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
	}

	public Fisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void imprimeCadastro() {

		System.out.println("** Física \n Nome: " + getNome() + "\n CPF: " + getCpf() + "\n Endereco: " + getEndereco()
				+ "\n Telefone: " + getTelefone());

	}

}
