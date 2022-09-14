package cn.cy.client;


import cn.cy.config.DefaultFeignConfiguration;
import cn.cy.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "service-product",configuration = DefaultFeignConfiguration.class)
public interface ProductClient {

    @GetMapping("/product/list")
    List<Product> selectProduct();

}
