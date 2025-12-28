package entidades;

import java.time.LocalDate;
import java.util.Date;

public class Pessoa {
	private int id;
	private String nome;
	private String telefone;
	private int idade;
	private String genero;
	private LocalDate dataCadastro;
	
	
	public Pessoa(int id, String nome, String telefone, int idade, String genero, LocalDate dataCadastro){
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
		this.genero = genero;
		this.dataCadastro = dataCadastro;
	}

	public int getId(){
		return id;
	}
	
	//public void setId(int id){
	//	this.id = id;
	//}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public String getGenero(){
		return genero;
	}
	
	public void setGenero(String genero){
		this.genero = genero;
	}
	
	public LocalDate getDataCadastro(){
		return dataCadastro;
	}
	
	public void setDataCadastro(LocalDate dataCadastro){
		this.dataCadastro = dataCadastro;
	}
	
	
	@Override
	public String toString(){
		String saida = "Código Pessoa: "+getId()+
				       "\nNome Pessoa:"+getNome()+
				       "\nTelefone: "+getTelefone()+
				       "\nIdade: "+getIdade()+	   
				       "\nGenero: "+getGenero()+
				       "\nData de Cadastro: "+getDataCadastro(); 		
		return saida;
	}
	
}