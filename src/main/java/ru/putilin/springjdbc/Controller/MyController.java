package ru.putilin.springjdbc.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.putilin.springjdbc.Service.MyService;
import ru.putilin.springjdbc.Model.Product;

import java.util.List;

@RestController
@RequestMapping("/products/fetch-product")
public class MyController {

    private final MyService service;

    public MyController(MyService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Product> getProductName(@RequestParam("name") String name ) {
       return service.getProductName(name);
    }
}
