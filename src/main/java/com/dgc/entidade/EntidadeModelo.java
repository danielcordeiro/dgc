package com.dgc.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Index;

@Entity
@Table(name = "entidade", schema = "public")
public class EntidadeModelo extends Entidade {

	private static final long serialVersionUID = -142718630823260613L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	private long id;

	@Column(name = "descricao")
	private String descricao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
