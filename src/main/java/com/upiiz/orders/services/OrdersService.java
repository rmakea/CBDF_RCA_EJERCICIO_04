package com.upiiz.orders.services;

import java.util.List;

import com.upiiz.orders.models.Orders;
import com.upiiz.orders.repository.OrdersRepository;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    // Requerimos el REPO (Datos - Listado) - Categorias

    OrdersRepository ordersRepository;

    // Constructor - Cuando crea la instancia le pasa el repositorio
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    // GET - Todas las categorias
    public List<Orders> getAllOrders() {
        return ordersRepository.obtenerTodas();
    }

    // GET - Categorias por id
    public Orders getOrderById(Long id) {
        return ordersRepository.obtenerPorId(id);
    }

    // POST - Crear categoria
    public Orders createOrders(Orders orders) {
        return ordersRepository.guardar(orders);
    }

    // PUT - Axtualizar categoria
    public Orders updateOrders(Orders orders) {
        return ordersRepository.actualizar(orders);
    }

    // DELETE - Eliminar categoria
    public void deleteOrders(Long id) {
        ordersRepository.eliminar(id);
    }
}
