package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("/{name}")
    @ResponseStatus(code = HttpStatus.OK)
    public String saludo(@PathVariable String name) {
        return "Hola, bienvenido " + name;
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public String index() {
        return "Bienvenido";
    }

}
