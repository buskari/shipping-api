package com.meli.projetointegrador.shippingapi.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ShippingRequestDTO {
    @NotNull(message = "orderId cannot be null!")
    private Long orderId;
}
