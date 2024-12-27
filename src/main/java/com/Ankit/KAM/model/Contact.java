package com.Ankit.KAM.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role;
    private String email;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "lead_id")
    private Lead lead;
}
