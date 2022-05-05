package com.meli.projetointegrador.shippingapi.repository;

import com.meli.projetointegrador.shippingapi.model.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingRepository extends JpaRepository<Shipping, Long> {
}
