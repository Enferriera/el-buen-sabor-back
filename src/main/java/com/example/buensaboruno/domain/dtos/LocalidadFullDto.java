package com.example.buensaboruno.domain.dtos;

import com.example.buensaboruno.domain.entities.Domicilio;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LocalidadFullDto extends BaseFullDto {
    private String nombre;

    private List<DomicilioFullDto> listaDomicilios;

    private ProvinciaFullDto provincia;
}
