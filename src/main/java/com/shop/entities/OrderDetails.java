package com.shop.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


import java.io.Serializable;

@Data
@Entity
@Table(name="order_detail")
public class OrderDetails  implements Serializable {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Order orders;
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Product product;
    private Integer quantity;

}
