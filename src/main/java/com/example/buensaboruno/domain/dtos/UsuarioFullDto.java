package com.example.buensaboruno.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UsuarioFullDto extends BaseFullDto {
    private String userName;

    private ClienteFullDto cliente;

    private EmpleadoFullDto empleado;
}
