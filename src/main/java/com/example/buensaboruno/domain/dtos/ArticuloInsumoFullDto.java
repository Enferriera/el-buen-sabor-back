package com.example.buensaboruno.domain.dtos;





import lombok.*;
import java.util.HashSet;
import java.util.Set;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ArticuloInsumoFullDto extends BaseFullDto {
    private String denominacion;
    private Double precioCompra;
    private Double precioVenta;
    private Integer stockMaximo;
    private Integer stockActual;
    private boolean esParaElaborar;


    private Set<PromocionFullDto> estaEnPromociones = new HashSet<>();


    private UnidadMedidaFullDto unidadMedida;


    private Set<ImagenFullDto> listaImagen = new HashSet<>();

    private Set<ArticuloManufacturadoFullDto> articuloManufacturados = new HashSet<>();
}