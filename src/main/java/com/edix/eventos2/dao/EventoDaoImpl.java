package com.edix.eventos2.dao;

import java.sql.Date;
import java.util.ArrayList;
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
        List<Evento> listaEventos = new ArrayList<>();
        
        Evento evento1 = new Evento();
        evento1.setIdEvento(1);
        evento1.setActivo((byte) 1);
        evento1.setAforoMax(100);
        evento1.setCiudad("Madrid");
        evento1.setDescripcionE("Este es el primer evento");
        evento1.setDestacado("Sí");
        evento1.setDireccion("Calle Mayor, 1");
        evento1.setDuracion(120);
        evento1.setMinimoAsistencia(50);
        evento1.setNombreE("Evento 1");
        evento1.setPrecioDecimal(10.0);
        evento1.setTipo("Cultural");
        
        Evento evento2 = new Evento();
        evento2.setIdEvento(2);
        evento2.setActivo((byte) 1);
        evento2.setAforoMax(50);
        evento2.setCiudad("Barcelona");
        evento2.setDescripcionE("Este es el segundo evento");
        evento2.setDestacado("Sí");
        evento2.setDireccion("Calle Valencia, 5");
        evento2.setDuracion(180);
        evento2.setMinimoAsistencia(30);
        evento2.setNombreE("Evento 2");
        evento2.setPrecioDecimal(20.0);
        evento2.setTipo("Deportivo");
        
        listaEventos.add(evento1);
        listaEventos.add(evento2);
        
        return listaEventos;
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
