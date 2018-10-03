package com.bertazoli.patient.web;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("/api/v1/patient")
public class PatientResource {

    private final EurekaClient eurekaClient;

    @Autowired
    public PatientResource(@Qualifier("eurekaClient") EurekaClient eurekaClient) {
        this.eurekaClient = eurekaClient;
    }

    @GetMapping()
    public Mono<String> testEndpoint() {
        return Mono.justOrEmpty(eurekaClient.getApplicationInfoManager().getInfo().getId());
    }

    @GetMapping("/{id}")
    public Mono<String> testEndpoint2(@PathVariable String id) {
        return Mono.justOrEmpty(id);
    }
}
