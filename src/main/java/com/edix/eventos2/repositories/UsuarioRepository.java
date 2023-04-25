package com.edix.eventos2.repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.edix.eventos2.entities.Usuario;




public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	 @Query("SELECT u FROM Usuario u WHERE u.username = ?1")
	    Usuario findById(String username);
	 
	 @Query("SELECT u FROM Usuario u WHERE u.username = ?1")
	    Usuario eliminarUsuario(String username);

	@Query(value = "select * from usuarios where email = :email and password = :password", nativeQuery = true)
	Usuario findUsuario(@Param(value="email") String email, @Param(value="password") String password);


}


