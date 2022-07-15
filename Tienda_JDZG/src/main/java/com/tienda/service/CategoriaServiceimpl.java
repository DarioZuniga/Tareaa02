/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class CategoriaServiceimpl implements CategoriaService{

    @Autowired
    private CategoriaDao categoriaDao;
    

    @Override
    @Transitional(readOnly =true)
    
    public List<Categoria> getCategorias(boolean activos) {
        var lista= (List<Categoria>) categoriaDao.findAll();
    if (activos){
        lista.removeIf(e->!e.isActivo());
    } 
    return lista;
    }
       
    
    
    
    public List<Categoria> getCategorias() {
        return(List<Categoria>)categoriaDao.findAll();
    }
 @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
        
    }
 @Override
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);

    }
@Transitional(readOnly=true)





 @Override
    public Categoria getCategoria(Categoria categoria) {
        return Categoria.findById(categoria.getIdCategoria()).orElse(null);
    }
    
    
    
}

