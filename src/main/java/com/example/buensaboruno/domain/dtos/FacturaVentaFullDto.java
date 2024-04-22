package com.example.buensaboruno.domain.dtos;


import com.example.buensaboruno.domain.entities.DatosMercadoPago;

import com.example.buensaboruno.domain.enums.FormaPago;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FacturaVentaFullDto extends BaseFullDto {

    private LocalDate fechaFcturacion;
    private int numeroComprobante;
    private FormaPago formaPago;
    private BigDecimal subTotal;
    private BigDecimal descuento;
    private BigDecimal gastosEnvio;
    private BigDecimal totalVenta;

    private ClienteFullDto cliente;

    private List<PedidoVentaFullDto> listaPedidoVenta;

    private List<FacturaVentaDetalleFullDto> listaFacturaVentaDetalle;

    private DatosMercadoPago datosMercadoPago;
}
