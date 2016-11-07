package com.stefanini.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;


@ManagedBean(name = "agenteMB")
@SessionScoped
public class AgenteBean {

	@Inject
	private AgenteService agenteService;

	@Inject
	private Agente agente;

	public String tela() throws IOException {
		
		System.out.println("CHEGOU AQUI");
		FacesContext.getCurrentInstance().getExternalContext().redirect("pages/teste.xhtml");
		return "/pages/teste.xhtml";
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

}
