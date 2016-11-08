package br.com.projedata.grupodeestudos.principal;

import br.com.projedata.grupodeestudos.entidades.Fisica;
import br.com.projedata.grupodeestudos.entidades.Juridica;
import br.com.projedata.grupodeestudos.entidades.ProdutorRural;

public class Principal {

	public static void main(String[] args) {

		Fisica fisica = new Fisica();

		fisica.setNome("Mayckel");
		fisica.setEndereco("ROD. SC 108 KM 320");
		fisica.setTelefone("(48) 9929-8253");
		fisica.setCpf("051.456.589-57");

		fisica.imprimeCadastro();

		Juridica juridica = new Juridica();

		juridica.setNome("Projedata Informática LTDA");
		juridica.setEndereco("RUA JOÃO WESSLER");
		juridica.setTelefone("(48) 3302-1111");
		juridica.setCnpj("04.560.916.0001-57");
		juridica.setIncricaoEstadual("ISENTO");

		juridica.imprimeCadastro();

		ProdutorRural produtorRural = new ProdutorRural();

		produtorRural.setNome("Smael");
		produtorRural.setEndereco("Avenida Xiter");
		produtorRural.setTelefone("(48) 9999-9999");
		produtorRural.setCpf("000.000.000-00");
		produtorRural.setInscricaoRural("999999999");

		produtorRural.imprimeCadastro();

	}

}
