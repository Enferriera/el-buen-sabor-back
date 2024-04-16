package com.example.buensaboruno.domain.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CategoriaArticuloManufacturadoFullDto extends BaseFullDto {
    private String denominacion;

    private ArticuloManufacturadoFullDto articuloManufacturado;
}
