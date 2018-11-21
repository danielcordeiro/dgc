package com.dgc.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entidade", schema = "public")
public class EntidadeModelo extends Entidade {

	private static final long serialVersionUID = -142718630823260613L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	private long id;

	@Column(name = "descricao")
	private String descricao;
	

	@Column(name = "data_alteracao")
	private Date dataAlteracao;

	@Column(name = "id_usuario")
	private Long idUsuario;

	@Column(name = "ind_deletado")
	private boolean indDeletado;

	public void setIndDeletado(boolean indDeletado) {
		super.setIndDeletado(indDeletado);
		this.indDeletado = indDeletado;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		super.setDataAlteracao(dataAlteracao);
		this.dataAlteracao = dataAlteracao;
	}

	public void setIdUsuario(Long idUsuario) {
		super.setIdUsuario(idUsuario);
		this.idUsuario = idUsuario;
	}

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
