package com.example.buensaboruno.domain.entities;

import jakarta.persistence.*;
import lombok.*;

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
public class ArticuloManufacturado  extends Base{

    private String denominacion;
    private String descripcion;
    private double precioVenta;
    private Integer tiempoEstimadoMinutos;


    @OneToMany
    @JoinColumn(name="articuloManufacturado_id")
    private Set<Imagen> listaImagenManufacturado=new HashSet<>();


   @ManyToOne
    private UnidadMedida unidadMedida;

    @ManyToMany(mappedBy = "listaArticuloManufacturado")
    private Set<Promocion> estaEnPromociones = new HashSet<>();


}
