package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	private CPF cpf;
	private Email email;
	private String nome;
	
	private List<Telefone> telefone = new ArrayList<>();
	
	private String senha;

	public void adicionarTelefone(String ddd, String numero) {
		this.telefone.add(new Telefone(ddd , numero));
	}

	public String getCpf() {
		return cpf.getNumero();
	}

	public String getEmail() {
		return email.getEndereco();
	}


	public String getNome() {
		return nome;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public String getSenha() {
		return senha;
	}

}