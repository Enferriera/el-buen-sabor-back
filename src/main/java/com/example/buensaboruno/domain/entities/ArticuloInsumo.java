package com.example.buensaboruno.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class ArticuloInsumo extends Base{
    private String denominacion;
    private Double precioCompra;
    private Double precioVenta;
    private Integer stockMaximo;
    private Integer stockActual;
    private boolean esParaElaborar;

    @ManyToMany(mappedBy = "listaArticuloInsumo")
    private Set<Promocion> estaEnPromociones = new HashSet<>();

    @ManyToOne
    private UnidadMedida unidadMedida;

    @OneToMany
    @JoinColumn(name = "articuloInsumo_id")
    private Set<Imagen> listaImagen =new HashSet<>();




}
