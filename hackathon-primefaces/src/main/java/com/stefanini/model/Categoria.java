package com.stefanini.model;
// Generated 07/11/2016 12:04:52 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Categoria generated by hbm2java
 */
@Entity
@Table(name = "categoria", catalog = "hackathon")
public class Categoria implements java.io.Serializable {

	private Integer idCategoria;
	private String descricaiCategoria;

	public Categoria() {
	}

	public Categoria(String descricaiCategoria) {
		this.descricaiCategoria = descricaiCategoria;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCategoria", unique = true, nullable = false)
	public Integer getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	@Column(name = "descricaiCategoria", length = 50)
	public String getDescricaiCategoria() {
		return this.descricaiCategoria;
	}

	public void setDescricaiCategoria(String descricaiCategoria) {
		this.descricaiCategoria = descricaiCategoria;
	}

}
