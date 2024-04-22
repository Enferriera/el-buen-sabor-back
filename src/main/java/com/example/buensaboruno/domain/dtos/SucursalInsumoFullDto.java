package com.example.buensaboruno.domain.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SucursalInsumoFullDto extends BaseFullDto {
    private int stockActual;
    private int stockMinimo;
    private int stockMaximo;

    private ArticuloInsumoFullDto articuloInsumo;

    private SucursalEmpresaFullDto sucursalEmpresa;

}
