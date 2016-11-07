package com.stefanini.bean;

import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.service.DenuncianteService;

@Named( "denunciaMB")
@SessionScoped
public class DenunciaBean {

    @Inject
    private DenuncianteService denuncianteService;

    public String chamar() {
        return "/pages/teste.xhtml";
    }

}
