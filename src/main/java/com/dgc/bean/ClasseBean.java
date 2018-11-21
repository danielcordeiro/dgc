package com.dgc.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dgc.entidade.EntidadeModelo;
import com.dgc.service.ClasseService;

@ManagedBean(name = "classeBean")
@Controller
@Scope(value = "session")
public class ClasseBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ClasseService service;

	private List<EntidadeModelo> entidades;
	private EntidadeModelo entidadeSelecionada;

	public void findAllEntidadeModelo() {
		try {
			setEntidades(service.findAllEntidadeModelo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<EntidadeModelo> getEntidades() {
		return entidades;
	}

	public void setEntidades(List<EntidadeModelo> entidades) {
		this.entidades = entidades;
	}

	public EntidadeModelo getEntidadeSelecionada() {
		return entidadeSelecionada;
	}

	public void setEntidadeSelecionada(EntidadeModelo entidadeSelecionada) {
		this.entidadeSelecionada = entidadeSelecionada;
	}

}