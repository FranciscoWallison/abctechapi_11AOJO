package br.com.fiap.abctechapi.application.impl;

import br.com.fiap.abctechapi.application.OrderApplication;
import br.com.fiap.abctechapi.application.dto.OrderDto;

import br.com.fiap.abctechapi.entity.Order;
import br.com.fiap.abctechapi.entity.OrderLocation;
import br.com.fiap.abctechapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.stream.Collectors;

@Component
public class OrderApplicationImpl implements OrderApplication {


    private final OrderService orderService;

    @Autowired
    public OrderApplicationImpl(OrderService orderService){
        this.orderService = orderService;
    }

    @Override
    public List<Order> getOrders() {
        List<Order> order = this.orderService.getOrders()
                .stream()
                .map(o -> 
                    new Order(
                            o.getId(),
                            o.getOperatorId(),
                            o.getAssists(),
                            o.getStartOrderLocation(),
                            o.getEndOrderLocation()
                        )
                    )
                .collect(Collectors.toList());
        return order;
    }

    @Override
    public void createOrder(OrderDto orderDto) throws Exception {
        //service?
        Order order = new Order();
        order.setOperatorId(orderDto.getOperatorId());
        order.setStartOrderLocation(
                new OrderLocation(null,
                        orderDto.getStart().getLatitude(),
                        orderDto.getStart().getLongitude(),
                        new Timestamp(orderDto.getStart().getDate().getTime())));

        order.setEndOrderLocation(
                new OrderLocation(null,
                        orderDto.getEnd().getLatitude(),
                        orderDto.getEnd().getLongitude(),
                        new Timestamp(orderDto.getEnd().getDate().getTime())));

        this.orderService.saveOrder(order, orderDto.getServices());
    }
}
