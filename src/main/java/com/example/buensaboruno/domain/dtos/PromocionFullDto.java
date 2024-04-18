package com.example.buensaboruno.domain.dtos;

import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import lombok.*;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class PromocionFullDto extends BaseFullDto{
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private Double descuento;


    private Set<ArticuloInsumoFullDto> listaArticuloInsumo=new HashSet<>();

    private Set<ArticuloManufacturadoFullDto> listaArticuloManufacturado= new HashSet<>();
}
