package com.spring.mvc.studies.json;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {
    @PostMapping("/create")
    @ResponseBody
    public Product createProduct(@RequestBody Product product){

        Product product1 = new Product(1,"Asus Zenbook", 800);

        return product1;
    }



}
