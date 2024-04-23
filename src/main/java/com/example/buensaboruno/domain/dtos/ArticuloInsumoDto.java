package com.example.buensaboruno.domain.dtos;





import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ArticuloInsumoDto extends BaseDto {
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

}