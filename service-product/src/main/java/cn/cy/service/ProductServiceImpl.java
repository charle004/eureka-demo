package cn.cy.service;


import cn.cy.pojo.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public List<Product> selectProduct() {
        logger.debug("selectProduct...");
        return Arrays.asList(
                new Product(1,"华为手机",101,6000.0d),
                new Product(2,"小米手机",102,4000.0d),
                new Product(3,"苹果手机",103,9000.0d)
        );
    }
}
