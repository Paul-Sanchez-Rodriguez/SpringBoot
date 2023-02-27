package com.example.demo.metrica;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Metrica {
    @Autowired
    MeterRegistry r;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/metrica")
    public String Metrica() {
        r.counter("probando001").increment();
        return "metrica01 ----> " + r.counter("probando001").count();
    }
}

