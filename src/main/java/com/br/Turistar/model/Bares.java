package com.br.Turistar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "bares")
public class Bares {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	@NotNull
	private String nome;	
	@NotNull
	private String endereco;	
	@NotNull
	private String telefone;
	@NotNull
	private String especialidade;
	@NotNull
	private String site;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	@Override
	public String toString() {
		return "Bares ["
				+ "id=" + id + 
				", nome=" + nome + 
				", endereco=" + endereco + 
				", telefone=" + telefone +
				", especialidade=" + especialidade + 
				", site=" + site + 
				"]";
	}
	
}
