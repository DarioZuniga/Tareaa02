package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Articulo implements Serializable {
    
    //Para utilizarlo en la generación de la llave primaria autoincremental
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticulo;
            
    private Long idCategoria ;
    private String description;
    private String detalle ;
    private double precio ;
    private int existencia ;
    private boolean activo ;

    

    public Articulo() {  //Constructor default
    }

    
    
    public Articulo(Long idArticulo, Long idCategoria, String description, String detalle, double precio, int existencia, boolean activo) {
        this.idArticulo = idArticulo;
        this.idCategoria = idCategoria;
        this.description = description;
        this.detalle = detalle;
        this.precio = precio;
        this.existencia = existencia;
        this.activo = activo;
    }
}
