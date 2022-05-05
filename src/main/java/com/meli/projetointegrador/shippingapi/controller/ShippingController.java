package com.meli.projetointegrador.shippingapi.controller;

import com.meli.projetointegrador.shippingapi.dto.ShippingRequestDTO;
import com.meli.projetointegrador.shippingapi.model.Shipping;
import com.meli.projetointegrador.shippingapi.service.ShippingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    private final ShippingService shippingService;

    public ShippingController(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    @PostMapping
    public ResponseEntity<Shipping> create(@Valid @RequestBody ShippingRequestDTO shippingRequestDTO) {
        Shipping shipping = Shipping.builder()
                .status("Order created")
                .created(LocalDateTime.now())
                .lastUpdated(LocalDateTime.now())
                .orderId(shippingRequestDTO.getOrderId())
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(shippingService.save(shipping));
    }

    @GetMapping
    public ResponseEntity<List<Shipping>> getAll() {
        return ResponseEntity.ok().body(shippingService.findAll());
    }
    @GetMapping("/{trackingCode}")
    public ResponseEntity<Shipping> getOne(@RequestParam Long trackingCode) throws Exception {
        return ResponseEntity.ok().body(shippingService.findById(trackingCode));
    }
}
