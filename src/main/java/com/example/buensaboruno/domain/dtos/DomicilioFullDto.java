package com.example.buensaboruno.domain.dtos;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class DomicilioFullDto extends BaseFullDto {
    private String calle;
    private int numero;
    private int cp;


    private LocalidadFullDto localidad;


}
