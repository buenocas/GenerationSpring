package com.generationex.bilblioteca.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table
public class Usuario {
	
	@Column(name = "id",nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "CPF", nullable = false , length = 11)
	@NotNull
	@Size(min = 11, max = 11)
	private long cpf;
	
	
	@Column(name = "NOME" , nullable = false, length = 120)
	@NotNull
	@Size(min = 2, max = 120)
	private String nome;
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Column(name = "TEL", nullable = false, length = 15)
	@NotNull
	@Size(min = 11, max = 15)
	private long tel;
	
	@Column(name = "Endereco", nullable = false , length = 200)
	@NotNull
	@Size(min = 10, max = 200)
	private String endereco;
	
	

}
