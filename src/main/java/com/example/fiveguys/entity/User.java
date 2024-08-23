package com.example.fiveguys.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "p_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}