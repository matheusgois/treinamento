package com.stefanini.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Veiculos;

public class VeiculoRepository {
	
	@Inject
	private EntityManager manager;

	public void incluir(Veiculos veiculo) {
		this.manager.persist(veiculo);
		
	}

}
