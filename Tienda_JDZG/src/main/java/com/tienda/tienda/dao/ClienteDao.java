package com.tienda.tienda.dao;

import com.tienda.tienda.domain.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente,  Long>{
    
    public List<Cliente> findByApellidos(String apellidos);
    
    
}
