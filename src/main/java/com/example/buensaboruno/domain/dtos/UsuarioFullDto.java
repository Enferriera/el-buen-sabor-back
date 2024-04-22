package com.example.buensaboruno.domain.dtos;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@ToString

public class UsuarioFullDto extends BaseFullDto{
    private String auth0Id;
    private String userName;

}
