/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author josed
 */
public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);
    public void save(Categoria categoria);
    public void delete(Categoria categoria);
    public Categoria getCategoria(Categoria categoria);
}

