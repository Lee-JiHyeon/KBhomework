package com.kb.shop.domain;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "shippinginfo")
public class ShippingInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long orderId;
    private Long orderItemId;
    private String shippingStatus;

    // Order id
    // OrderItem id
    // shippingStatus

}
