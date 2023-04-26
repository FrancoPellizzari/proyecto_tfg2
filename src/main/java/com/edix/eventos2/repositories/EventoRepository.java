package com.edix.eventos2.repositories;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.edix.eventos2.entities.Evento;



public interface EventoRepository extends JpaRepository<Evento, Integer> {

	@Query("Select e FROM Evento e WHERE e.activo='1'")
	List<Evento>eventosactivos();
	
	@Query (" Select d FROM Evento d Where d.destacado= 's'")
	List<Evento>eventosdestacados ();
	
	@Query ( "Select e from Evento e")
	List <Evento> todosEventos ();
	
	
	Evento findByIdEvento(int idEvento);
	
}
