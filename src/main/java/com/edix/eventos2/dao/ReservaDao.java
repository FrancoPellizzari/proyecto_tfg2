package com.edix.eventos2.dao;

import java.util.List;

import com.edix.eventos2.entities.Reserva;




public interface ReservaDao {
	
	Reserva buscarUno(int idReserva);
	List<Reserva> buscarTodos();
	int borrarReserva(int idReserva);
	int modificarReserva(Reserva reserva);
	int altaReserva(Reserva reserva);
	

}
