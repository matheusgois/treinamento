package com.stefanini.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.primefaces.event.SelectEvent;

import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;

@ManagedBean(name = "agenteMB")
@SessionScoped
public class AgenteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private AgenteService agenteService;

	@Inject
	private Agente agente;

	public String tela() throws IOException {

		System.out.println("CHEGOU AQUI");

		agenteService.incluir(this.agente);
		return "/index.xhtml";
	}

	private List<Agente> agentes = new ArrayList<Agente>();

	public void setAgentes(List<Agente> agentes) {
		this.agentes = agentes;
	}

	public List<Agente> getAgentes() {
		return agentes;
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public void onRowSelect(SelectEvent event) {
		FacesMessage msg = new FacesMessage("Car Selected");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

}
