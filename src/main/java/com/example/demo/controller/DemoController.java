package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/{name}")
    @ResponseStatus(code = HttpStatus.OK)
    public String saludo(@PathVariable String name) {
        return "Hola, bienvenido " + name;
    }

}
