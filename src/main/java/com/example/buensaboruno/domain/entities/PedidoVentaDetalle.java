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
public class PedidoVentaDetalle extends Base{
    private double cantidad;
    private double subtotal;
    @ManyToOne
    @JoinColumn(name="articuloManufacturado_id")
    private ArticuloManufacturado articuloManufacturado;

    @ManyToOne
    @JoinColumn(name="articuloInsumo_id")
    private ArticuloInsumo articuloInsumo;
    @ManyToOne
    @JoinColumn(name="pedidoVenta_id")
    private PedidoVenta pedidoVenta;
    @ManyToOne
    @JoinColumn(name="promocion_id")
    private Promocion promocion;
}
