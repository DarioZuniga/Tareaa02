package com.tienda.tienda.service;

import com.tienda.tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
 public List<Categoria> getCategorias(boolean activos);   
 
 public  void save(Categoria categoria);
    
 public void delete(Categoria categoria);
 
 public Categoria getCategoria(Categoria categoria);
    
}
