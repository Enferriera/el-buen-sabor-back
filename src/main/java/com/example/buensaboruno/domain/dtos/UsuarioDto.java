package com.example.buensaboruno.domain.dtos;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@ToString

public class UsuarioDto extends BaseDto {
    private String auth0Id;
    private String userName;

}
