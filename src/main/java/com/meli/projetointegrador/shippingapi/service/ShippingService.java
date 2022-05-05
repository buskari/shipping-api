package com.meli.projetointegrador.shippingapi.service;

import com.meli.projetointegrador.shippingapi.model.Shipping;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShippingService {
    List<Shipping> findAll();
    Shipping findById(Long id) throws Exception;
    Shipping save(Shipping shipping);
}
