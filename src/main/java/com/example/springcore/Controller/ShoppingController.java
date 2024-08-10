package com.example.springcore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcore.Bean.ShoppingCart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/cart")
public class ShoppingController {
    
    @Autowired
    ShoppingCart cart;

    @GetMapping("/add")
    public String addToCart(@RequestParam (name = "item") String item) {
        this.cart.addToCart(item);
        return "Added";
    }
    @GetMapping("items")
    public String items() {
        return "Added " + this.cart.getNoOfItem();
    }
    
    
}
