package com.stefanini.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import com.stefanini.model.Localinfracao;
import com.stefanini.service.LocalService;

@ManagedBean(name = "localMB")
public class LocalBean {

	@Inject
	private Localinfracao local;
	
	@Inject
	private LocalService localService;

	public Localinfracao getLocal() {
		return local;
	}

	public void setLocal(Localinfracao local) {
		this.local = local;
	}

	public String tela() throws IOException {

		System.out.println("CHEGOU AQUI");

		localService.incluir(this.local);
		return "/index.xhtml";
	}

}
