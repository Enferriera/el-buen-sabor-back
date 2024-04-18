package com.example.buensaboruno.domain.dtos;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class DetallePedidoFullDto extends BaseFullDto {
    private Integer cantidad;
    private Double subtotal;



    private ArticuloManufacturadoFullDto articuloManufacturado;


    private ArticuloInsumoFullDto articuloInsumo;


    private PedidoFullDto pedidoVenta;

}
