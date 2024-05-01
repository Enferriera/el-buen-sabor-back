package com.example.buensaboruno.domain.entities;

import com.example.buensaboruno.domain.enums.Estado;
import com.example.buensaboruno.domain.enums.FormaPago;
import com.example.buensaboruno.domain.enums.TipoEnvio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PedidoVenta extends Base{

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

    @ManyToOne
    @JoinColumn(name="empleado_id")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;

    //si el empleado ya lo tiene, es necesario?
    @ManyToOne
    @JoinColumn(name = "sucursalEmpresa_id")
    private SucursalEmpresa sucursalEmpresa;

    //no sería un pedido tiene una factura OneToOne
    @ManyToOne
    @JoinColumn(name="facturaVenta_id")
    private FacturaVenta facturaVenta;

    @OneToMany(mappedBy = "pedidoVenta", cascade = CascadeType.ALL)
    private List<PedidoVentaDetalle> listaPedidoVentaDetalle/*=new ArrayList<>()*/;

}
