package org.example.tp3.exo2;

public class OrderService {
    private final OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public Order createOrder(Order order) {
        return orderDao.saveOrder(order);
    }
}
