/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Articulo;
import java.util.List;

/**
 *
 * @author josed
 */
public interface ArticuloService {
    
    public List<Articulo> getArticulos();
    public void save(Articulo articulo);
    public void delete(Articulo articulo);
    public Articulo getArticulo(Articulo articulo);
}

