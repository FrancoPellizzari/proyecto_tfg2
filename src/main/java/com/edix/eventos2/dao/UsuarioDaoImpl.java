package com.edix.eventos2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edix.eventos2.dto.RegistroUsuarioDTO;
import com.edix.eventos2.entities.Usuario;
import com.edix.eventos2.repositories.UsuarioRepository;


@Repository
public class UsuarioDaoImpl implements UsuarioDao {
	private List<Usuario>listaUsuarios;
	@Autowired
	UsuarioRepository usuarioRepo;
	
	public Usuario buscarUno(String username) {
		return usuarioRepo.findById(username);
	}
	
	


	
	@Override
	public boolean registro(Usuario usuario) {
		if(usuarioRepo.findById(usuario.getUsername()) == null) {
			usuarioRepo.save(usuario);
			return true;
		}
		return false;
	}
//	@Override
//	public Usuario guardar(RegistroUsuarioDTO registroDTO) {
//		RegistroUsuarioDTO registroUsuario = new RegistroUsuarioDTO(registroDTO.getNombre(),
//				registroDTO.getEmail(),
//				registroDTO.getPassword());
//		
//		return usuarioRepo.save(registroUsuario);
//	} 
	@Override
	public Usuario findUser(String email, String password) {
		
		return usuarioRepo.findUsuario(email,password);
	}
	
	@Override
	public Usuario modificarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepo.save(usuario);
	}

	@Override
	public void eliminarUsuario(String username) {
		
		usuarioRepo.eliminarUsuario(username);
	}
	
	@Override
	public Usuario altaUsuario(Usuario usuario) {
		
		return usuarioRepo.save(usuario);
	}

//	@Override
//	public boolean registro(Usuario usuario) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	

	
	
	

}
