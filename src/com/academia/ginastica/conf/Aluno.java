package com.academia.ginastica.conf;

public class Aluno {

	public Aluno(String nomeCompleto, String cpf, String sexo, String status, int idade, Double altura, Double peso,
			Pacotes p) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.sexo = sexo;
		this.status = status;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.p = p;
	}

	private String nomeCompleto, cpf, sexo, status;
	int idade;
	Double altura, peso;
	private Pacotes p;

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Pacotes getP() {
		return p;
	}

	public void setP(Pacotes p) {
		this.p = p;
	}

}
