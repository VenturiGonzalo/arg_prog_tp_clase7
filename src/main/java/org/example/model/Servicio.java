package org.example.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_administrador", referencedColumnName = "id")
    private Administrador administrador;

    @ManyToOne
    @JoinColumn(name = "id_prestador", referencedColumnName = "id")
    private Prestador prestador;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_servicio", referencedColumnName = "id")
    private List<Tarea> tareaList;


    public Servicio(String nombre, String descripcion, Administrador administrador, Prestador prestador, List<Tarea> tareaList) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.administrador = administrador;
        this.prestador = prestador;
        this.tareaList = tareaList;
    }
}
