package com.edix.eventos2.dao;

import java.util.List;

import com.edix.eventos2.entities.Evento;



public interface EventoDao {

	Evento findById(int idEvento);
	boolean registro(Evento evento);
	Evento buscarUno(int idEvento);
	List<Evento> eventoactivos();
	List<Evento>eventosdestacados ();
	Evento altaEvento (Evento evento);
	Evento modificarEvento (Evento evento);
	void eliminarEvento (int idEvento);
	List<Evento>mostrarTodos();
}
