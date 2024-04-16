package com.example.buensaboruno.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProvinciaFullDto extends BaseFullDto {
    private String nombre;

    private PaisFullDto pais;

    private List<LocalidadFullDto> listaLocalidades;
}
