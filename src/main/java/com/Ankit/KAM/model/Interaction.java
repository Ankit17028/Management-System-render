package com.Ankit.KAM.model;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;


@Entity
@Data
public class Interaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String details; // Details about the interaction
    private LocalDateTime interactionDate;

    @ManyToOne
    @JoinColumn(name = "lead_id")
    private Lead lead;
}
