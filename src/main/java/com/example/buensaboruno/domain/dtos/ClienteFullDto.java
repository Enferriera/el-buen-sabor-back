package com.example.buensaboruno.domain.dtos;


import lombok.*;
import java.util.HashSet;
import java.util.Set;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString


public class ClienteFullDto extends BaseFullDto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;



    private UsuarioFullDto usuario;


    private Set<PedidoFullDto> listaPedido=new HashSet<>();


}
