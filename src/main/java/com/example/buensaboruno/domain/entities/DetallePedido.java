package com.example.buensaboruno.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class DetallePedido extends Base{
    private Integer cantidad;
    private Double subtotal;

    @OneToOne

    private ArticuloManufacturado articuloManufacturado;

    @OneToOne
    @JoinColumn(name = "articuloInsumo_id")
    private ArticuloInsumo articuloInsumo;

    @ManyToOne
    @JoinColumn(name = "pedidoVenta_id")
    private Pedido pedidoVenta;


}
