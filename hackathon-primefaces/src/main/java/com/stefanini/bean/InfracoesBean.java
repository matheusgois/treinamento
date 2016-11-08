package com.stefanini.bean;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import com.stefanini.model.Infracoes;

@ManagedBean(name="infracoesMB")
public class InfracoesBean {

	@Inject
	private Infracoes infracoes;

	public Infracoes getInfracoes() {
		return infracoes;
	}

	public void setInfracoes(Infracoes infracoes) {
		this.infracoes = infracoes;
	}
	
	
	
}
