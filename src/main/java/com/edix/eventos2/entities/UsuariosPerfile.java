package com.edix.eventos2.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;



/**
 * The persistent class for the usuarios_perfiles database table.
 * 
 */
@Entity
@Table(name="usuarios_perfiles")
@NamedQuery(name="UsuariosPerfile.findAll", query="SELECT u FROM UsuariosPerfile u")
public class UsuariosPerfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//uni-directional many-to-one association to Perfile
	@ManyToOne
	@JoinColumn(name="id_perfil")
	private Perfile perfil;

	//uni-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="username")
	private Usuario usuario;

	public UsuariosPerfile() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Perfile getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfile perfil) {
		this.perfil = perfil;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}