package com.upiiz.orders.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.upiiz.orders.models.Orders;
import org.springframework.stereotype.Repository;

@Repository
public class OrdersRepository {
    //Alamacenar en un listado las categoria: salvar, listas, eliminar 
    //Generar de manera unida el id para cada categoria
    private List<Orders> orders = new ArrayList<Orders>();
    private AtomicLong id = new AtomicLong();

    //Agregamos la orden al listado y la regresamos
    //POST
    public Orders guardar(Orders order){
        order.setId(id.incrementAndGet());
        orders.add(order);
        return order;
    }
    
    //GET - Todas las categorias
    public List<Orders> obtenerTodas(){
        return orders;
    }

    //GET - Una categoria
    public Orders obtenerPorId(Long id){
        
        //Funcional
        return orders.stream().filter(orders -> orders.getid().equals(id)).findFirst().orElse(null);
    }

    //DELETE
    public void eliminar(Long id){
        orders.removeIf(Orders -> Orders.getid().equals(id));
    }

    //PUT
    public Orders actualizar(Orders order){
        eliminar(order.getid());
        orders.add(order);
        return order;
    } 
}
