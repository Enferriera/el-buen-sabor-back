package com.example.buensaboruno.domain.dtos;



import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class LocalidadFullDto extends BaseFullDto{
    private String nombre;


    private ProvinciaFullDto provincia;
}
