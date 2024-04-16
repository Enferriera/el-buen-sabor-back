package com.example.buensaboruno.domain.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ClienteFullDto extends BaseFullDto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    private UsuarioFullDto usuario;

    private DomicilioFullDto domicilio;

    private List<PedidoVentaFullDto> listaPedidoVenta;

    private List<FacturaVentaFullDto> listaFacturaVenta=new ArrayList<>();
}
