package com.Task16.ProductDemoProject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/getValue")
    public String print(){
        return "hello";
    }
}
