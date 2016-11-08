package com.stefanini.model;
// Generated 07/11/2016 12:04:52 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Localinfracao generated by hbm2java
 */
@Entity
@Table(name = "localinfracao", catalog = "hackathon")
public class Localinfracao implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idLocalInfracao;
	private String descricaoLocalInfracao;
	private Double velocidadePermitida;

	public Localinfracao() {
	}

	public Localinfracao(String descricaoLocalInfracao, Double velocidadePermitida) {
		this.descricaoLocalInfracao = descricaoLocalInfracao;
		this.velocidadePermitida = velocidadePermitida;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idLocalInfracao", unique = true, nullable = false)
	public Integer getIdLocalInfracao() {
		return this.idLocalInfracao;
	}

	public void setIdLocalInfracao(Integer idLocalInfracao) {
		this.idLocalInfracao = idLocalInfracao;
	}

	@Column(name = "descricaoLocalInfracao", length = 100)
	public String getDescricaoLocalInfracao() {
		return this.descricaoLocalInfracao;
	}

	public void setDescricaoLocalInfracao(String descricaoLocalInfracao) {
		this.descricaoLocalInfracao = descricaoLocalInfracao;
	}

	@Column(name = "velocidadePermitida", precision = 22, scale = 0)
	public Double getVelocidadePermitida() {
		return this.velocidadePermitida;
	}

	public void setVelocidadePermitida(Double velocidadePermitida) {
		this.velocidadePermitida = velocidadePermitida;
	}

}
