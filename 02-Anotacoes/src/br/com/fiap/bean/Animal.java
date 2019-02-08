package br.com.fiap.bean;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome="TAB_ANIMAL")
public class Animal {
	
	@Coluna(nome="cd_animal",nulleable=false)
	private int codigo;
	
	@Coluna(nome="qtd_patas",nulleable= true)
	private int quantidadePatas;
	
	@Coluna(nome="ds_especie", nulleable = false)
	private String especie;
	
	@Coluna(nome="ds_voador", nulleable = false)
	private boolean voador;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQuantidadePatas() {
		return quantidadePatas;
	}
	public void setQuantidadePatas(int quantidadePatas) {
		this.quantidadePatas = quantidadePatas;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public boolean isVoador() {
		return voador;
	}
	public void setVoador(boolean voador) {
		this.voador = voador;
	}
	public Animal(int codigo, int quantidadePatas, String especie, boolean voador) {
		super();
		this.codigo = codigo;
		this.quantidadePatas = quantidadePatas;
		this.especie = especie;
		this.voador = voador;
	}
	public Animal() {
		super();
	}
	
	
}
