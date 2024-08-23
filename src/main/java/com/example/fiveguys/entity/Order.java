package com.example.fiveguys.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "p_order")
@RequiredArgsConstructor
@Getter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id", length = 100, nullable = false)
    private String userId;

    @Column(nullable = false)
    private Integer quantity;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "created_by", length = 100)
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by", length = 100)
    private String updatedBy;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "deleted_by", length = 100)
    private String deletedBy;

    @Column(name = "order_type", length = 100)
    private String orderType;

    @Column(length = 50)
    private String status;

    @Column(name = "hidden")
    private Boolean hidden;

//
//    @ManyToOne
//    @JoinColumn(name = "product_id", nullable = false)
//    private Product product;


}

