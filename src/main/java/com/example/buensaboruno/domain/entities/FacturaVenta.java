package com.example.buensaboruno.domain.entities;

import com.example.buensaboruno.domain.enums.FormaPago;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FacturaVenta extends Base{
    private LocalDate fechaFcturacion;
    private int numeroComprobante;
    private FormaPago formaPago;
    private BigDecimal subTotal;
    private BigDecimal descuento;
    private BigDecimal gastosEnvio;
    private BigDecimal totalVenta;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;

    //OneToOne ??
    @OneToMany(cascade = CascadeType.ALL)
    private List<PedidoVenta> listaPedidoVenta;

    @OneToMany(mappedBy = "facturaVenta",cascade = CascadeType.ALL)
    private List<FacturaVentaDetalle> listaFacturaVentaDetalle;

    @OneToOne
    @JoinColumn(name="datosMercadoPago_id")
    private DatosMercadoPago datosMercadoPago;
}
