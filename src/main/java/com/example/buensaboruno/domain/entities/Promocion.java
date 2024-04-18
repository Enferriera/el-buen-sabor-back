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
public class Promocion  extends Base{
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private Double descuento;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "promocion_articuloInsumo",
            joinColumns = @JoinColumn(name = "promocion_id"),
            inverseJoinColumns = @JoinColumn(name = "articuloInsumo_id"))
    @Builder.Default
    private Set<ArticuloInsumo> listaArticuloInsumo=new HashSet<>();

    @ManyToMany
    @JoinTable(name = "promocion_articuloManufacturado",
            joinColumns = @JoinColumn(name = "promocion_id"),
            inverseJoinColumns = @JoinColumn(name = "articuloManufacturado_id"))
    @Builder.Default
    private Set<ArticuloManufacturado> listaArticuloManufacturado= new HashSet<>();
}
