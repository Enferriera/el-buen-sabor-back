package com.example.buensaboruno.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FacturaVentaDetalle  extends Base{
    private int cantidad;
    private BigDecimal subTotal;
    @ManyToOne
    @JoinColumn(name="facturaVenta_id")
    private FacturaVenta facturaVenta;
    @ManyToOne
    @JoinColumn(name="articuloInsumo_id")
    private ArticuloInsumo articuloInsumo;
    @ManyToOne
    @JoinColumn(name="articuloManufacturado_id")
    private ArticuloManufacturado articuloManufacturado;
}
