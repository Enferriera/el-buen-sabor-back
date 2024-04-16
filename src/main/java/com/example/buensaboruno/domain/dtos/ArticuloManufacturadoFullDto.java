package com.example.buensaboruno.domain.dtos;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ArticuloManufacturadoFullDto extends BaseFullDto {
    private String denominacion;
    private String descripcion;
    private double precioVenta;
    private double precioCosto;
    private Integer tiempoEstimado;

    private SucursalEmpresaFullDto sucursalEmpresa;

    private CategoriaArticuloManufacturadoFullDto categoriaArticuloManufacturado;

    private List<ImagenManufacturadoFullDto> listaImagenManufacturado;
    private List<ArticuloManufacturadoDetalleFullDto> articulosManufacturadosdetalles = new ArrayList<>();

}
