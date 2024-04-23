package com.example.buensaboruno.domain.dtos;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CategoriaDto {

    private String denominacion;

    private Set<SucursalDto> sucursales = new HashSet<>();

    private Set<ArticuloDto> articulos = new HashSet<>();

    private Set<CategoriaDto> subCategorias = new HashSet<>();
}
