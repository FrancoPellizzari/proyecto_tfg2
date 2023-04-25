package com.edix.eventos2.dao;

import com.edix.eventos2.dto.RegistroUsuarioDTO;
import com.edix.eventos2.entities.Usuario;

public interface UsuarioDao {
	
	Usuario buscarUno(String username);
	boolean registro(Usuario usuario);
	//Usuario guardar(RegistroUsuarioDTO registroDTO);
	Usuario findUser(String email, String password);
	Usuario altaUsuario (Usuario ususario);
	Usuario modificarUsuario (Usuario usuario);
	void eliminarUsuario (String username);
	
	

}
