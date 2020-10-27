package com.mall.distributedshop.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.mall.distributedshop.product.dao")
@SpringBootApplication
public class ShopProductApplication {

    public static void main(String[] args) {

        SpringApplication.run(ShopProductApplication.class, args);
    }

}
