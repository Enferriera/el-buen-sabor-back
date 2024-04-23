package com.example.buensaboruno.domain.dtos;



import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class ProvinciaDto extends BaseDto {
    private String nombre;


    private PaisDto pais;

}
