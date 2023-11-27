package org.example.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Entity
@NoArgsConstructor
@Table(name="proveedor")
public class Prestador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String apellido;

    private String email;

    private String disponibilidad;

    private String radioCobertura;

    private LocalDate fechaNacimiento;

    private String tipoDoc;

    private long nroDoc;

    private long cuit;

    private String telefono;

    private String horario;


    public Prestador(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
}
