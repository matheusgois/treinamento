package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Localinfracao;
import com.stefanini.repository.LocalRepository;

@Stateless
public class LocalService {
	
	@Inject
	private LocalRepository localRepository;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void incluir(Localinfracao local){
        localRepository.incluir(local);
    }

}
