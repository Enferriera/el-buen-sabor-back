package com.example.buensaboruno.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PromocionDetalle  extends Base{
    private int cantidad;
    @ManyToOne
    @JoinColumn(name="articuloManufacturado_id")
    private ArticuloManufacturado articuloManufacturado;

    @ManyToOne
    @JoinColumn(name="articuloInsumo_id")
    private ArticuloInsumo articuloInsumo;
    @ManyToOne
    @JoinColumn(name="promocion_id")
    private Promocion promocion;
}
