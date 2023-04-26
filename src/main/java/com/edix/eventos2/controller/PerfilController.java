package com.edix.eventos2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.edix.eventos2.dao.PerfilDao;
import com.edix.eventos2.entities.Perfile;

@Controller
@RequestMapping("/perfil")
public class PerfilController {
	
	@Autowired
	private PerfilDao perfilRepo;
	
	@GetMapping("/todos")
	public String todosUsuarios(Model model) {
		model.addAttribute("mensaje", "Listado de perfiles");
		return "pruebas";
	}
	
	@GetMapping ("/verUno/{id_perfil}")
	public Perfile buscarUno (@PathVariable ("id_perfil") int id_perfil){
		return perfilRepo.findById(id_perfil);
		
	}

}
