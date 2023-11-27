package org.example.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name="opinion_proveedor")
public class OpinionProveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Contrato contrato;

    @OneToOne
    private Prestador prestador;

    private int estrellas;

    private String opinion;
}
