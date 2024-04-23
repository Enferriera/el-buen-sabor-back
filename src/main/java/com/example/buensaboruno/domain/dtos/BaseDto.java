package com.example.buensaboruno.domain.dtos;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class BaseDto {

    private Long id;

    protected boolean estaActivo;

}