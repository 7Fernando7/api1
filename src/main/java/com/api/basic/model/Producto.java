package com.api.basic.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Producto {

    private Integer id;
    private String nombre;
    private String descripcion;
    private double precio;
}
