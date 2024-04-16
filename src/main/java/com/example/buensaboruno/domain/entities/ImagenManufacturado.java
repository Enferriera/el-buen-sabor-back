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
public class ImagenManufacturado  extends Base{
    private String denominacion;
    @ManyToOne
    @JoinColumn(name="articuloManufacturado_id")
    private ArticuloManufacturado articuloManufacturado;
}
