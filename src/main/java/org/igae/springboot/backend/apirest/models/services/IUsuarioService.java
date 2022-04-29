package org.igae.springboot.backend.apirest.models.services;

import org.igae.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
