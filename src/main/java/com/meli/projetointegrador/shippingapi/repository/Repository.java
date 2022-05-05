package com.meli.projetointegrador.shippingapi.repository;

import com.meli.projetointegrador.shippingapi.model.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Shipping, Long> {
}
