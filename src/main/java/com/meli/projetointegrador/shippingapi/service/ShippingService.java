package com.meli.projetointegrador.shippingapi.service;

import com.meli.projetointegrador.shippingapi.model.Shipping;

import java.util.List;

public interface ShippingService {
    List<Shipping> findAll();
    Shipping findById();
    Shipping save(Shipping shipping);
}
