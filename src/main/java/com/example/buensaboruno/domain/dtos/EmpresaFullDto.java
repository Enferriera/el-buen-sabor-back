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
public class EmpresaFullDto extends BaseFullDto {
    private Long id;
    private String nombre;
    private String razonSocial;
    private int cuil;

    private List<SucursalEmpresaFullDto> listaSucursalEmpresa;
}
