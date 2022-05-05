package com.meli.projetointegrador.shippingapi.controller;

import com.meli.projetointegrador.shippingapi.exception.EntityNotFoundException;
import com.meli.projetointegrador.shippingapi.model.Shipping;
import com.meli.projetointegrador.shippingapi.service.ShippingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class ShippingController {

    private final ShippingService shippingService;

    public ShippingController(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    @GetMapping
    public ResponseEntity<List<Shipping>> getAll() {
        return ResponseEntity.ok().body(shippingService.findAll());
    }

    @GetMapping("/{trackingCode}")
    public ResponseEntity<Shipping> getOne(@RequestParam Long trackingCode) throws Exception {
        return ResponseEntity.ok().body(shippingService.findById(trackingCode));
    }

    @PostMapping
    public ResponseEntity<Shipping> create(Shipping shipping) {
        return ResponseEntity.status(HttpStatus.CREATED).body(shippingService.save(shipping));
    }
}
