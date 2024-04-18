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
    @Builder.Default
    private Set<Imagen> listaImagenManufacturado=new HashSet<>();


   @ManyToOne
    private UnidadMedida unidadMedida;

    @ManyToMany(mappedBy = "listaArticuloManufacturado")
    @Builder.Default
    private Set<Promocion> estaEnPromociones = new HashSet<>();

    @ManyToMany
    //SE AGREGA EL JOIN TABLE PARA QUE JPA CREE LA TABLA INTERMEDIA EN UNA RELACION MANY TO MANY
    @JoinTable(name = "articuloManufacturado_articuloInsumo",
            joinColumns = @JoinColumn(name = "articuloManufacturado_id"),
            inverseJoinColumns = @JoinColumn(name = "articuloInsumo_id"))
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<ArticuloInsumo> articulosInsumos = new HashSet<>();


}
