package com.meli.projetointegrador.shippingapi.service;

import com.meli.projetointegrador.shippingapi.exception.EntityNotFound;
import com.meli.projetointegrador.shippingapi.model.Shipping;
import com.meli.projetointegrador.shippingapi.repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingServiceImpl implements ShippingService {

    private final ShippingRepository shippingRepository;

    public ShippingServiceImpl(ShippingRepository shippingRepository) {
        this.shippingRepository = shippingRepository;
    }

    @Override
    public List<Shipping> findAll() {
        return shippingRepository.findAll();
    }

    @Override
    public Shipping findById(Long trackingCode) throws EntityNotFound {
        return shippingRepository.findById(trackingCode).orElseThrow(() -> new EntityNotFound("Shipping not found!"));
    }

    @Override
    public Shipping save(Shipping shipping) {
        return shippingRepository.save(shipping);
    }
}
