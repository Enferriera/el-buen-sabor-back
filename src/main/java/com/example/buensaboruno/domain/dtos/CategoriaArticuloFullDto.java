package com.example.buensaboruno.domain.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CategoriaArticuloFullDto extends BaseFullDto {
    private String denominacion;

    private CategoriaArticuloFullDto categoriaArticuloPadre=null;

    private List<CategoriaArticuloFullDto> listaCategoriaArticulo;
    private ArticuloInsumoFullDto articuloInsumo;
}
