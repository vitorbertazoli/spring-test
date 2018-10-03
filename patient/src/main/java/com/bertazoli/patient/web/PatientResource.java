package com.bertazoli.patient.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("/api/v1/patient")
public class PatientResource {

    @GetMapping
    public Mono<Integer> testEndpoint() {
        return Mono.justOrEmpty(1);
    }
}
