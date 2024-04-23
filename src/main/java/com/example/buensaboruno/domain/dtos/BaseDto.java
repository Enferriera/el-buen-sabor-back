package com.example.buensaboruno.domain.dtos;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BaseDto {


    private Long id;

    protected boolean isActive;

}