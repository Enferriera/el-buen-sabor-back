package com.example.buensaboruno.domain.dtos;


import com.example.buensaboruno.domain.enums.Rol;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmpleadoFullDto extends BaseFullDto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    private SucursalEmpresaFullDto sucursalEmpresa;

    private UsuarioFullDto usuario;
    private Rol perfil;

    private List<PedidoVentaFullDto> listaPedidoVenta;
}
