package dev.java._x.CadastroDeNinjas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TabelaNinja")
public class NinjaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String nome;
	String email;
	int idade;
	
	
	
	public NinjaModel() {
		super();
	}



	public NinjaModel(String nome, String email, int idade) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
}
