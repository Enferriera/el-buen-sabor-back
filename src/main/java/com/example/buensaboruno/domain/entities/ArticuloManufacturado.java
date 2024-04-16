package com.example.buensaboruno.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ArticuloManufacturado  extends Base{

    private String denominacion;
    private String descripcion;
    private double precioVenta;
    private double precioCosto;
    private Integer tiempoEstimado;
    @ManyToOne
    @JoinColumn(name="sucursalEmpresa_id")
    private SucursalEmpresa sucursalEmpresa;
    @OneToOne
    @JoinColumn(name="categoriaArticuloManufacturado_id")
    private CategoriaArticuloManufacturado categoriaArticuloManufacturado;
    @OneToMany(mappedBy = "articuloManufacturado")
    private List<ImagenManufacturado> listaImagenManufacturado;
    @OneToMany(mappedBy = "articuloManufacturado", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ArticuloManufacturadoDetalle> articulosManufacturadosdetalles = new ArrayList<>();
}
