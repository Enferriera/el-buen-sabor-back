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
public class ArticuloInsumo extends Base{
    private String denominacion;
    private double precioCompra;
    private double precioVenta;
    private boolean esParaElaborar;
    @ManyToOne
    @JoinColumn(name="unidadMedida_id")
    private UnidadMedida    unidadMedida;
    @OneToMany(mappedBy = "articuloInsumo", cascade = CascadeType.ALL)
    private List<SucursalInsumo> listaSucursalInsumo;
    @OneToOne
    @JoinColumn(name="imagenInsumo_id")
    private ImagenInsumo imagenInsumo;
    @OneToMany(mappedBy = "articuloInsumo" , cascade = CascadeType.ALL)
    private List<CategoriaArticulo> listaCategoriaArticulo;
    @OneToMany(cascade = CascadeType.ALL)
    private List<PedidoVentaDetalle> listaPedidoVentaDetalle=new ArrayList<>();
}
