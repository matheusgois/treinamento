package com.stefanini.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import com.stefanini.model.Modelo;
import com.stefanini.model.Veiculos;
import com.stefanini.service.VeiculoService;

@ManagedBean(name = "veiculoMB")
public class VeiculosBean {

	@Inject
	private Veiculos veiculo;

	@Inject
	private Modelo modelo;
	
	@Inject
	private VeiculoService veiculoService;

	/*private List<Veiculos> veiculos = new ArrayList<Veiculos>();

	public List<Veiculos> getAgentes() {
		return veiculos;
	}*/

	public String tela() throws IOException {

		System.out.println("CHEGOU AQUI no veiculos");

		veiculoService.incluir(this.veiculo);
		return "/index.xhtml";
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Veiculos getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculos veiculo) {
		this.veiculo = veiculo;
	}

}
