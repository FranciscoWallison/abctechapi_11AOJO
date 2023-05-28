package br.com.fiap.abctechapi.application;
import java.util.List;
import br.com.fiap.abctechapi.application.dto.OrderDto;
import br.com.fiap.abctechapi.entity.Order;

public interface OrderApplication {
    public List<Order> getOrders();
    public void createOrder(OrderDto orderDto) throws Exception;
}
