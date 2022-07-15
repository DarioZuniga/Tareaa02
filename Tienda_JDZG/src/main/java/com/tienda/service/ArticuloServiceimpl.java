/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.dao.ArticuloDao;
import com.tienda.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class ArticuloServiceimpl implements ArticuloService{

    @Autowired
    private ArticuloDao categoriaDao;
    

    @Override
    @Transitional(readOnly =true)
    
    public List<Articulo> getArticulos(boolean activos) {
        var lista= (List<Articulo>) categoriaDao.findAll();
    if (activos){
        lista.removeIf(e->!e.isActivo());
    } 
    return lista;
    }
       
    
    
    
    public List<Articulo> getArticulos() {
        return(List<Articulo>)categoriaDao.findAll();
    }
 @Override
    @Transactional
    public void save(Articulo categoria) {
        categoriaDao.save(categoria);
        
    }
 @Override
    public void delete(Articulo categoria) {
        categoriaDao.delete(categoria);

    }
@Transitional(readOnly=true)





 @Override
    public Articulo getArticulo(Articulo categoria) {
        return Articulo.findById(categoria.getIdArticulo()).orElse(null);
    }
    
    
    
}

