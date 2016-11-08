package com.stefanini.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Localinfracao;

public class LocalRepository {
	
	@Inject
	private EntityManager manager;

	public void incluir(Localinfracao local) {
		this.manager.persist(local);
		
	}

}
