package org.igae.springboot.backend.apirest.models.dao;

import org.igae.springboot.backend.apirest.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);
	
	// Alternativa
	//@Query("select u from Usuario u where u.username=?1")
	//public Usuario findByUsername2(String username);

}