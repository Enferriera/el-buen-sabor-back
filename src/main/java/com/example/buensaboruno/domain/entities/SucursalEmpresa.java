package com.example.buensaboruno.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SucursalEmpresa extends  Base{

    private String nombre;
    private String horarioApertura;
    private String horarioCierre;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    @ManyToOne
    @JoinColumn(name="empresa_id")
    private Empresa empresa;

    //bidireccionalidad
    @OneToMany(mappedBy = "sucursalEmpresa")
    private List<SucursalInsumo> listaSucursalInsumo;

    @OneToMany(mappedBy = "sucursalEmpresa"/*, cascade = CascadeType.ALL*/)
    private List<PedidoVenta> listaPedidoVenta/*=new ArrayList<>()*/;

    @OneToMany(mappedBy = "sucursalEmpresa")
    private List<Empleado> listaEmpleados;

}
