package br.com.fiap.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;



@Entity
@Table(name="T_ZOOLOGICO")
@SequenceGenerator(name="zoologico",sequenceName="SQ_T_ZOOLOGICO",allocationSize=1)
public class Zoologico {
	
	@Id
	@Column(name="cd_zoologico")
	@GeneratedValue(generator="zoologico",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_zoologico", nullable = false, length=20)
	private String nome;
	
	@Column(name="qt_animais")
	private int qtdAnimais;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_tipo")
	private TipoZoo tipo;
	
	@Column(name="hr_abertura")
	@Temporal(TemporalType.TIME)
	private Date hrAbertura;
	
	@Temporal(TemporalType.TIME)
	@Column(name="hr_fechamento")
	private Date hrFechamento;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_inauguracao")
	private Date inauguracao;
	
	@Column(name="st_emergencia")
	private boolean emergencia;
	
	@Transient
	private boolean aberto;
	
	@Lob
	@Column(name="fl_logo")
	private byte[] logo;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAnimais() {
		return qtdAnimais;
	}

	public void setQtdAnimais(int qtdAnimais) {
		this.qtdAnimais = qtdAnimais;
	}

	public TipoZoo getTipo() {
		return tipo;
	}

	public void setTipo(TipoZoo tipo) {
		this.tipo = tipo;
	}

	public Date getHrAbertura() {
		return hrAbertura;
	}

	public void setHrAbertura(Date hrAbertura) {
		this.hrAbertura = hrAbertura;
	}

	public Date getHrFechamento() {
		return hrFechamento;
	}

	public void setHrFechamento(Date hrFechamento) {
		this.hrFechamento = hrFechamento;
	}

	public Date getInauguracao() {
		return inauguracao;
	}

	public void setInauguracao(Date inauguracao) {
		this.inauguracao = inauguracao;
	}

	public boolean isEmergencia() {
		return emergencia;
	}

	public void setEmergencia(boolean emergencia) {
		this.emergencia = emergencia;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public Zoologico() {
		super();
	}

	public Zoologico(String nome, int qtdAnimais, TipoZoo tipo, Date hrAbertura, Date hrFechamento, Date inauguracao,
			boolean emergencia, byte[] logo) {
		super();
		this.nome = nome;
		this.qtdAnimais = qtdAnimais;
		this.tipo = tipo;
		this.hrAbertura = hrAbertura;
		this.hrFechamento = hrFechamento;
		this.inauguracao = inauguracao;
		this.emergencia = emergencia;
		this.logo = logo;
	}

	public Zoologico(int codigo, String nome, int qtdAnimais, TipoZoo tipo, Date hrAbertura, Date hrFechamento,
			Date inauguracao, boolean emergencia, boolean aberto, byte[] logo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.qtdAnimais = qtdAnimais;
		this.tipo = tipo;
		this.hrAbertura = hrAbertura;
		this.hrFechamento = hrFechamento;
		this.inauguracao = inauguracao;
		this.emergencia = emergencia;
		this.aberto = aberto;
		this.logo = logo;
	}
	
	
}
