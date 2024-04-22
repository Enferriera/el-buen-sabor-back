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
public class SucursalEmpresaFullDto extends BaseFullDto {
    private String nombre;
    private String horarioApertura;
    private String horarioCierre;

    private DomicilioFullDto domicilio;

    private EmpresaFullDto empresa;

    private List<SucursalInsumoFullDto> listaSucursalInsumo;

    private List<PedidoVentaFullDto> listaPedidoVenta=new ArrayList<>();
}
