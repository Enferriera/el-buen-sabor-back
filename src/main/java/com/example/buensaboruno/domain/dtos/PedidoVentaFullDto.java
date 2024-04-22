package com.example.buensaboruno.domain.dtos;


import com.example.buensaboruno.domain.enums.Estado;
import com.example.buensaboruno.domain.enums.FormaPago;
import com.example.buensaboruno.domain.enums.TipoEnvio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PedidoVentaFullDto extends BaseFullDto {
    private String horaEstimadaFinalizacion;
    private BigDecimal subtotal;
    private BigDecimal descuento;
    private BigDecimal gastoEnvio;
    private BigDecimal total;
    private BigDecimal totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;

    private EmpleadoFullDto empleado;

    private ClienteFullDto cliente;

    private SucursalEmpresaFullDto sucursalEmpresa;

    private FacturaVentaFullDto facturaVenta;

    private List<PedidoVentaDetalleFullDto> listaPedidoVentaDetalle=new ArrayList<>();

}
