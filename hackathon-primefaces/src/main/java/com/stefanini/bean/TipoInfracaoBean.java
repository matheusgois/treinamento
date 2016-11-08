package com.stefanini.bean;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import com.stefanini.model.Tipoinfracao;

@ManagedBean(name="tipoinfMB")
public class TipoInfracaoBean {

	@Inject
	private Tipoinfracao tipoInfracao;

	public Tipoinfracao getTipoInfracao() {
		return tipoInfracao;
	}

	public void setTipoInfracao(Tipoinfracao tipoInfracao) {
		this.tipoInfracao = tipoInfracao;
	}
	
}
