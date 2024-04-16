package com.example.buensaboruno.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CategoriaArticuloManufacturado  extends Base{
    private String denominacion;
    @OneToOne(mappedBy = "categoriaArticuloManufacturado")
    private ArticuloManufacturado articuloManufacturado;
}
