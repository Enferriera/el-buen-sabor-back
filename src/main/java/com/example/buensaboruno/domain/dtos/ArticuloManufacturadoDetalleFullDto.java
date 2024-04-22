package com.example.buensaboruno.domain.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ArticuloManufacturadoDetalleFullDto extends BaseFullDto {
    private double cantidad;

    private ArticuloInsumoFullDto articuloInsumo;

    private ArticuloManufacturadoFullDto articuloManufacturado;
}