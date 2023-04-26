package com.edix.eventos2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edix.eventos2.entities.Perfile;
import com.edix.eventos2.repositories.PerfilRepository;


@Repository
public class PerfilDaoImpl implements PerfilDao {
	
	@Autowired
	PerfilRepository perfilRepo;
	
	@Override
	public Perfile findById(int id_perfil) {
		
		return perfilRepo.findById(id_perfil).orElse(null);
	}

	@Override
	public boolean guardar(Perfile perfil) {
		if (findById(perfil.getId_perfil()) == null) {
			perfilRepo.save(perfil);
			return true;
		}
		return false;
		
	}

	@Override
	public List<Perfile> obtenerTodos() {
		// TODO Auto-generated method stub
		return perfilRepo.findAll();
	}

	@Override
	public void eliminar(int id_perfil) {
		// TODO Auto-generated method stub
		perfilRepo.deleteById(id_perfil);
	}

	@Override
	public Perfile actualizar(Perfile perfil) {
		// TODO Auto-generated method stub
		return perfilRepo.save(perfil);
	}
	
	@Override
	public Perfile altaPerfil(Perfile perfil) {
		// TODO Auto-generated method stub
		return perfilRepo.save(perfil);
	}

}
