package com.tienda.dao;

import com.tienda.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface CreditoDao extends CrudRepository<Cliente, Long>{
    
}
