package com.java.render.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String home() {
        return "A19003928 - Sebastian Paolo Poma Ramon";
    }

    @GetMapping("/idat/codigo")
    public String codigo() {
        return "A19003928";
    }

    @GetMapping("/idat/nombre-completo")
    public String nombreCompleto() {
        return "Sebastian Paolo Poma Ramon";
    }
}
