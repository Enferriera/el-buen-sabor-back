package com.example.buensaboruno.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Sucursal extends  Base{

    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    @OneToOne
    private Domicilio domicilio;

    @OneToMany
    @JoinColumn(name="sucursal_id")
    @Builder.Default
    private Set<Promocion> listaPromocion= new HashSet<>();

    @OneToMany
    @JoinColumn(name="sucursal_id")
    @Builder.Default
    private Set<Categoria> listaCategoria= new HashSet<>();
}
