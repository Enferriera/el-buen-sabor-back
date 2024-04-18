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
    @Builder.Default
    private Set<Promocion> estaEnPromociones = new HashSet<>();

    @ManyToOne
    private UnidadMedida unidadMedida;

    @OneToMany
    @JoinColumn(name = "articuloInsumo_id")
    @Builder.Default
    private Set<Imagen> listaImagen =new HashSet<>();


    @ManyToMany(mappedBy = "articulosInsumos")
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<ArticuloManufacturado> articuloManufacturados = new HashSet<>();

}
