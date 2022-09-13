package cn.cy.service;


import cn.cy.pojo.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Override
    public List<Product> selectProduct() {
        return Arrays.asList(
                new Product(1,"华为手机",101,6000.0d),
                new Product(2,"小米手机",102,4000.0d),
                new Product(3,"苹果手机",103,9000.0d)
        );
    }
}
