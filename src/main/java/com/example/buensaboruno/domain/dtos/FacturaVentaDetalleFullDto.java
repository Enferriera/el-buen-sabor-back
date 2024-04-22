package com.example.buensaboruno.domain.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FacturaVentaDetalleFullDto extends BaseFullDto {
    private int cantidad;
    private BigDecimal subTotal;

    private FacturaVentaFullDto facturaVenta;

    private ArticuloInsumoFullDto articuloInsumo;

    private ArticuloManufacturadoFullDto articuloManufacturado;
}
