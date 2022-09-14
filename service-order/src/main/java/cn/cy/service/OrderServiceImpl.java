package cn.cy.service;

import cn.cy.client.ProductClient;
import cn.cy.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private ProductClient productClient;

    @Override
    public Order getOrderById(Integer id) {
        Order order = new Order();
        order.setId(id);
        order.setOrderId(UUID.randomUUID().toString());
        order.setProductList(productClient.selectProduct());
        return order;
    }


}
