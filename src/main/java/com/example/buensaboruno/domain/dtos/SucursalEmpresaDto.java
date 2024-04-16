package com.example.buensaboruno.domain.dtos;

import com.example.buensaboruno.domain.entities.Domicilio;
import com.example.buensaboruno.domain.entities.Empresa;
import com.example.buensaboruno.domain.entities.PedidoVenta;
import com.example.buensaboruno.domain.entities.SucursalInsumo;
import jakarta.persistence.*;
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
public class SucursalEmpresaDto {
    private String nombre;
    private String horarioApertura;
    private String horarioCierre;

    private DomicilioDto domicilio;

    private EmpresaDto empresa;

    private List<SucursalInsumoDto> listaSucursalInsumo;

    private List<PedidoVentaDto> listaPedidoVenta=new ArrayList<>();
}
