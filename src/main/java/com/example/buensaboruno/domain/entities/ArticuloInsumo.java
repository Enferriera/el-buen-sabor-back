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
    @JoinColumn(name = "unidadMedida_id")
    private UnidadMedida unidadMedida;

    @OneToMany(mappedBy = "articuloInsumo")
    private List<SucursalInsumo> listaSucursalInsumo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imagenInsumo_id")
    private ImagenInsumo imagenInsumo;

    //No sería un articulo puede tener mucha categorias o un articulo puede tener una categoria
    @OneToMany(mappedBy = "articuloInsumo" , cascade = CascadeType.ALL)
    private List<CategoriaArticulo> listaCategoriaArticulo;

    //bidireccionalidad
    @OneToMany(mappedBy = "articuloInsumo")
    private List<PedidoVentaDetalle> listaPedidoVentaDetalle/*=new ArrayList<>()*/;

    @OneToMany(mappedBy = "articuloInsumo")
    private List<FacturaVentaDetalle> listaFacturaVentaDetalle;

    @OneToMany(mappedBy = "articuloInsumo")
    private List<PromocionDetalle> listaPromocionDetalle;

    @OneToMany(mappedBy = "articuloInsumo")
    private List<ArticuloManufacturadoDetalle> listaArticuloManufacturadoDetalle;
}
