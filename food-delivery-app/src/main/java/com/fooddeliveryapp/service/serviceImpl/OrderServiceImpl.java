package com.fooddeliveryapp.service.serviceImpl;

import com.fooddeliveryapp.exception.OrderException;
import com.fooddeliveryapp.model.Customer;
import com.fooddeliveryapp.model.Item;
import com.fooddeliveryapp.model.Order;
import com.fooddeliveryapp.repository.OrderRepository;
import com.fooddeliveryapp.service.OrderService;

import java.util.List;
import java.util.Optional;

public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order getOrder(Integer orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() ->
                new OrderException("Order", "id", orderId));
    }

    @Override
    public Order updateOrder(Order order, Integer orderId) {
        //check if order exists
        Order existingOrder = orderRepository.findById(orderId)
                .orElseThrow(() ->
                        new OrderException("Order", "id", orderId));

        //update order's values
        existingOrder.setOrderDate(order.getOrderDate());
        existingOrder.setBill(order.getBill());
        existingOrder.setPaymentMethod(order.getPaymentMethod());
        existingOrder.setCart(order.getCart());

        //save order to db
        orderRepository.save(existingOrder);
        return existingOrder;
    }

    @Override
    public void deleteOrder(Integer orderId) {
        orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderException("Order", "id", orderId));
        orderRepository.deleteById(orderId);

    }

    /**
     * Tghis is a wrong method!!!!
     * @param customerId
     * @return
     */
    @Override
    public List<Item> getOrdersByCustomer(Integer customerId) {
        //get the customer wanted by the id
        Optional<Customer> customer =
                curomerRepository.findById(customerId)
                .orElseThrow(() ->
                new CustomerException("Customer", "id", customerId));
        List<Item> itemList = customer.getFoodCart().getItemList();
        if(itemList.size() > 0) {
            return itemList;
        } else {
            throw new RuntimeException("No orders found!!");
        }

    }
}
