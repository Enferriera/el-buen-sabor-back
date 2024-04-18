package com.example.buensaboruno.domain.dtos;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class ProvinciaFullDto {
    private String nombre;


    private PaisFullDto pais;
}
