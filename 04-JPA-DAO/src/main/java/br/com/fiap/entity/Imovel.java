package br.com.fiap.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * 	T_IMOVEL
 * 	CD_IMOVEL (NUMBER)(PK) (SEQUENCE SQ_T_IMOVEL)
 * 	DS_TIPO (VARCHAR)(ENUM...)
 * 	VL_AREA (NUMBER)
 * 	DT_CONSTRUCAO (DATE)
 * 	*DS_LOGRADOURO (VARCHAR(100))
 *
 */
@Entity
@SequenceGenerator(name="codigo", sequenceName="SQ_T_IMOVEL", allocationSize=1)
@Table(name="T_IMOVEL")
public class Imovel {	
	@Id
	@Column(name="CD_IMOVEL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="codigo")
	private int codigo;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_TIPO", nullable=false)
	private Tipo tipo;
	
	@Column(name="VL_AREA")
	private int area;
	
	@Column(name="DT_CONSTRUCAO")
	private Date dtConstrucao;
	
	@Column(name="DT_CONSTRUCAO", nullable=false, length=100)
	private String logradouro;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public Date getDtConstrucao() {
		return dtConstrucao;
	}

	public void setDtConstrucao(Date dtConstrucao) {
		this.dtConstrucao = dtConstrucao;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Imovel() {
		super();
	}

	public Imovel(int codigo, Tipo tipo, int area, Date dtConstrucao, String logradouro) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.area = area;
		this.dtConstrucao = dtConstrucao;
		this.logradouro = logradouro;
	}

	public Imovel(Tipo tipo, int area, Date dtConstrucao, String logradouro) {
		super();
		this.tipo = tipo;
		this.area = area;
		this.dtConstrucao = dtConstrucao;
		this.logradouro = logradouro;
	}
	
}
