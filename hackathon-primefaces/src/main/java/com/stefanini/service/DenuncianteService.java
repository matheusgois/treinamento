package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Denuncia;
import com.stefanini.repository.DenuncianteRepository;

@Stateless
public class DenuncianteService {

    @Inject
    private DenuncianteRepository denuncianteRepository;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void incluir(Denuncia denuncia){
        denuncianteRepository.incluir(denuncia);
    }

}
