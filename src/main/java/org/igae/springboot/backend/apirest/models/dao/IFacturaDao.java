package org.igae.springboot.backend.apirest.models.dao;

import org.igae.springboot.backend.apirest.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository<Factura, Long>{

}
