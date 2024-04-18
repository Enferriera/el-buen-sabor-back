package com.example.buensaboruno.domain.dtos;


import lombok.*;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class SucursalFullDto extends BaseFullDto {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;


    private DomicilioFullDto domicilio;


    private Set<PromocionFullDto> listaPromocion= new HashSet<>();


    private Set<CategoriaFullDto> listaCategoria= new HashSet<>();
}
