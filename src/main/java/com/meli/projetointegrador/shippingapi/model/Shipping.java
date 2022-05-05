package com.meli.projetointegrador.shippingapi.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Shipping {
    @Id
    private Long trackingCode;
    private String status;
    private LocalDateTime created;
    private LocalDateTime lastUpdated;
    private Long orderId;
}
