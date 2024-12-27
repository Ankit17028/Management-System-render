package com.Ankit.KAM.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CallPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int frequency; // Number of days between calls
    private String notes; // Any notes about the call plan

    @OneToOne
    @JoinColumn(name = "lead_id")
    private Lead lead;
}

