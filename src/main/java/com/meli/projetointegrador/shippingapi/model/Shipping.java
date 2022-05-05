package com.meli.projetointegrador.shippingapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Shipping {
    @Id
    private Long trackingCode;
    private String status;
    private LocalDateTime created;
    private LocalDateTime lastUpdated;
    private Long orderId;
}
