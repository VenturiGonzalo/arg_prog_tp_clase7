package org.example.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "contrato")
@Data
@NoArgsConstructor
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate fecha;

    private String lugar;

    private String rangoHorario;

    private EstadoTrabajoEnum estadoTrabajo;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "contrato_tarea",
            joinColumns = @JoinColumn(name = "id_contrato"),
            inverseJoinColumns = @JoinColumn(name = "id_tarea"))
    private List<Tarea> tareaList;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "contrato_prestador",
            joinColumns = @JoinColumn(name = "id_contrato"),
            inverseJoinColumns = @JoinColumn(name = "id_prestador"))
    private List<Prestador> prestadorList;

    @ManyToOne
    @JoinColumn(name = "id_consumidor", referencedColumnName = "id")
    private Consumidor consumidor;
}
