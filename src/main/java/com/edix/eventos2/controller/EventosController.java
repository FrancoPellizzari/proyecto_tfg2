package com.edix.eventos2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edix.eventos2.dao.EventoDao;

import com.edix.eventos2.entities.Evento;

@Controller
@RequestMapping("/eventos")
public class EventosController {
	
	@Autowired
	private EventoDao eventoRepo;
	
	
	
	@GetMapping("/activos")
	public List<Evento> eventosActivos(){
		return eventoRepo.eventoactivos();
	}
	
	@GetMapping ("/verUno/{idEvento}")
	public Evento buscarUno (@PathVariable ("idEvento") int idEvento){
		return eventoRepo.buscarUno(idEvento);
		
	}
	
	@GetMapping("/eventosdestacados")
	public List<Evento> obtenerEventosDestacados() {
	    return eventoRepo.eventosdestacados();
	}
	

}
