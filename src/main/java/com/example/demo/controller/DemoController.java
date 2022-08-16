package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

    @GetMapping("/reactive")
    @ResponseStatus(code = HttpStatus.OK)
    public Mono<String> reactiveMono() {
        return Mono.just("Saludo!");
    }

    @GetMapping("/reactive-flux")
    @ResponseStatus(code = HttpStatus.OK)
    public Flux<String> reactiveFlux() {
        return Flux.just("One", "Two", "Three", "Four");
    }

}
