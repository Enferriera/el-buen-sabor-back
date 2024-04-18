package com.example.buensaboruno.domain.dtos;



import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CategoriaFullDto {

    private String denominacion;


    private Set<CategoriaFullDto> listaCategoria= new HashSet<>();



    private Set<ArticuloInsumoFullDto> listaArticuloInsumo=new HashSet<>();


    private Set<ArticuloManufacturadoFullDto> listaArticuloManufacturado=new HashSet<>();


}
