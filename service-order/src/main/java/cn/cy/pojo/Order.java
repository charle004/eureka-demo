package cn.cy.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Integer id;
    private String orderId;

    private List<Product> productList;


}
