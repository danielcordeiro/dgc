package com.dgc.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dgc.service.ClasseService;

@ManagedBean(name = "classeBean")
@Controller
@Scope(value = "session")
public class ClasseBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ClasseService service;

}