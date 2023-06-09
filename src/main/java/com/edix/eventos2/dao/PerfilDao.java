package com.edix.eventos2.dao;

import java.util.List;

import com.edix.eventos2.entities.Perfile;



public interface PerfilDao {

	  Perfile findById(int id_perfil);
	  boolean guardar(Perfile perfil);
	  List<Perfile> obtenerTodos();
	  void eliminar(int id_perfil);
	  Perfile actualizar(Perfile perfil);
	  Perfile altaPerfil(Perfile perfil);
}
