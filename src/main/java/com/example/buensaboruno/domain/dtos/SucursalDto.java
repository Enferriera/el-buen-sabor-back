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

public class SucursalDto extends BaseDto {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    private DomicilioDto domicilio;

    private Set<CategoriaDto> categorias = new HashSet<>();

    private Set<PromocionDto> promociones = new HashSet<>();
}