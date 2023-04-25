package com.edix.eventos2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edix.eventos2.entities.Evento;
import com.edix.eventos2.repositories.EventoRepository;


@Repository
public class EventoDaoImpl implements EventoDao {
	@Autowired
	EventoRepository eventoRepo;
	
		@Override
		public Evento findById(int idEvento) {
		
		return eventoRepo.findById(idEvento).orElse(null);
	}
	@Override		
	public boolean registro(Evento evento) {
		
		if (buscarUno(evento.getIdEvento()) == null) {
			eventoRepo.save(evento);
			return true;
		}
		return false;
		
	}
	
	@Override
	public Evento buscarUno(int idEvento) {
		
		return eventoRepo.findById(idEvento).orElse(null);
	}
	
	@Override
	public List<Evento> eventoactivos() {
		// TODO Auto-generated method stub
		return eventoRepo.eventosactivos();
	}
	
	@Override
	public List<Evento> eventosdestacados() {
		// TODO Auto-generated method stub
		return eventoRepo.eventosdestacados();
	}
	
	
	@Override
	public Evento altaEvento(Evento evento) {
		// TODO Auto-generated method stub
		return eventoRepo.save(evento);
	}
	
	@Override
	public Evento modificarEvento(Evento evento) {
		// TODO Auto-generated method stub
		return eventoRepo.save(evento);
	}
	@Override
	public void eliminarEvento(int idEvento) {
		
		eventoRepo.deleteById(idEvento);
	}
	@Override
	public List<Evento> mostrarTodos() {
		// TODO Auto-generated method stub
		return eventoRepo.findAll();
	
	
	
	
	
	

	
	}
}
