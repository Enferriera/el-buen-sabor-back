package com.example.buensaboruno.domain.dtos;



import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class ArticuloManufacturadoFullDto extends BaseFullDto {
    private String denominacion;
    private String descripcion;
    private double precioVenta;
    private Integer tiempoEstimadoMinutos;



    private Set<ImagenFullDto> listaImagenManufacturado=new HashSet<>();



    private UnidadMedidaFullDto unidadMedida;


    private Set<PromocionFullDto> estaEnPromociones = new HashSet<>();


    private Set<ArticuloInsumoFullDto> articulosInsumos = new HashSet<>();


}
