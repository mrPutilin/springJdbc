package ru.putilin.springjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.putilin.springjdbc.service.MyService;

import java.util.List;

@RestController
@RequestMapping("/products/fetch-product")
public class MyController {

    private final MyService service;

    public MyController(MyService service) {
        this.service = service;
    }

    @GetMapping()
    public List<String> getProductName(@RequestParam("name") String name ) {
       return service.getProductName(name);
    }
}
