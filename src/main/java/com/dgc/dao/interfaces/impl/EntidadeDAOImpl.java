package com.dgc.dao.interfaces.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dgc.dao.interfaces.EntidadeDAOInterface;
import com.dgc.dao.interfaces.DaoModelInterface;
import com.lad.entidade.EntidadeModelo;

@Transactional
@Repository("EntidadeDAO")
public class EntidadeDAOImpl extends DaoModelInterface<EntidadeModelo> implements EntidadeDAOInterface, Serializable {

	private static final long serialVersionUID = 1L;

}