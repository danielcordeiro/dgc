package com.dgc.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgc.dao.interfaces.EntidadeDAOInterface;

@Service
public class ClasseService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private EntidadeDAOInterface entidadeDAO;;
}
