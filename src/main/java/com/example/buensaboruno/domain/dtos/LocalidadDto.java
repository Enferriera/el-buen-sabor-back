package com.example.buensaboruno.domain.dtos;



import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class LocalidadDto extends BaseDto {
    private String nombre;


    private ProvinciaDto provincia;
}
