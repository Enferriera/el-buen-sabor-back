package com.example.buensaboruno.domain.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PromocionDetalleFullDto extends BaseFullDto {
    private double cantidad;
    private double subtotal;

    private ArticuloManufacturadoFullDto articuloManufacturado;


    private ArticuloInsumoFullDto articuloInsumo;

    private PedidoVentaFullDto pedidoVenta;

    private PromocionFullDto promocion;
}
