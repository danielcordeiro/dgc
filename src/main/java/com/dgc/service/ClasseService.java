package com.dgc.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgc.dao.interfaces.EntidadeDAOInterface;
import com.dgc.entidade.EntidadeModelo;

@Service
public class ClasseService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private EntidadeDAOInterface entidadeModeloDAO;

	public List<EntidadeModelo> findAllEntidadeModelo() throws Exception {
		return entidadeModeloDAO.findAll();
	};
}
