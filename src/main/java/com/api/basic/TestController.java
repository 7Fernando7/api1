package com.api.basic;

import com.api.basic.model.Producto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hola mundo";
    }

    @GetMapping("/bye")
    public String bye() {
        return "Bye mundo";
    }

    @GetMapping("/producto")
    public Producto get() {
        return new Producto(1 ,"televison", "Televisior 21 pulgadas", 566D);
    }
    @GetMapping("/productos")
    public List<Producto> getProducts(){
        return getProductos();
    }

    @GetMapping(value = "/productos/{id}")
    public Producto getProductsId(@PathVariable Integer id){
        for (Producto p : getProductos()) {
            if (p.getId()==id) {
                return p;
            }
        }
        return null;
    }

    @PostMapping("/productos")
    public String receivProducto(@RequestBody Producto producto) {
        log.info("Ide de producto: {}", producto.getId());

        return "Producto recibido";
    }

    public List<Producto> getProductos() {
    List<Producto> listaProductos;
        listaProductos = new ArrayList<>();

        listaProductos.add( new Producto(1 ,"televison", "Televisior 21 pulgadas", 566D));
        listaProductos.add( new Producto(2 ,"Sofá", "sofá 2 y 3 plazas", 2566D));
        listaProductos.add( new Producto(3 ,"Maquinda de lavar", "Lava e seca", 1566D));
        listaProductos.add( new Producto(4 ,"Cama", "Matrimonio", 3566D));
        listaProductos.add( new Producto(5 ,"Mesa", "Comedor con 4 sillas", 966D));
        listaProductos.add( new Producto(6 ,"Armario", "Habitación 5 puertas", 2566D));
        listaProductos.add( new Producto(7 ,"Ollas", "Juego 6 piezas", 266D));
        listaProductos.add( new Producto(8 ,"Alfombra", "Salón", 766D));
        listaProductos.add( new Producto(9 ,"Tostadora", "Vintage", 156D));

        return listaProductos;
    }
}
