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
public class ArticuloInsumoFullDto extends BaseFullDto {
    private String denominacion;
    private double precioCompra;
    private double precioVenta;
    private boolean esParaElaborar;

    private UnidadMedidaFullDto unidadMedida;

    private List<SucursalInsumoFullDto> listaSucursalInsumo;

    private ImagenInsumoFullDto imagenInsumo;
    private List<CategoriaArticuloFullDto> listaCategoriaArticulo;

    private List<PedidoVentaDetalleFullDto> listaPedidoVentaDetalle=new ArrayList<>();

}
