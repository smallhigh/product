package com.imooc.product.service;

import com.imooc.product.dto.CartDTO;
import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


//继承测试主类,代替测试用到的那两个注解
//以后可以测试类加注解统一，加到测试主类然后继承
@Component
public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;
    @Test
    public void findUpAll() {
        List<ProductInfo> list=productService.findUpAll();
        Assert.assertTrue(list.size()>0);
    }

    @Test
    public void findList(){
        List<ProductInfo> list=productService.findList(Arrays.asList("111111","123456"));
        Assert.assertTrue(list.size()>0);
    }

    @Test
    public void decreaseStock(){
        CartDTO cartDTO=new CartDTO("111111",2);
        productService.decreaseStock(Arrays.asList(cartDTO));
    }
}