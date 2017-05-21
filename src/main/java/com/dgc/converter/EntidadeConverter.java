package com.dgc.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.dgc.dao.interfaces.EntidadeDAOInterface;
import com.dgc.entidade.EntidadeModelo;

@Component
@Scope(value = "request")
@FacesConverter(value = "entidadeConverter")
public class EntidadeConverter implements Converter {

	@Autowired
	private EntidadeDAOInterface entidadeDAO;

	public Object getAsObject(FacesContext fc, UIComponent uic, String codString) {
		EntidadeModelo entidadeModelo = new EntidadeModelo();
		if (codString != null) {
			try {
				entidadeModelo = getEntidadeDAO().obter(Long.valueOf(codString));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return entidadeModelo;
	}

	public String getAsString(FacesContext fc, UIComponent uic, Object o) {
		EntidadeModelo entidadeModelo = new EntidadeModelo();
		if (o != null) {
			entidadeModelo = (EntidadeModelo) o;
			return String.valueOf(entidadeModelo.getId());

		} else {
			return null;
		}

	}

	public EntidadeDAOInterface getEntidadeDAO() {
		return entidadeDAO;
	}

}
