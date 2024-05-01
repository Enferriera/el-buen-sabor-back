package com.example.buensaboruno.domain.entities;

import com.example.buensaboruno.domain.enums.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Empleado extends Persona{

    @ManyToOne
    @JoinColumn(name = "sucursalEmpresa_id")
    private SucursalEmpresa sucursalEmpresa;

    @OneToMany(mappedBy = "empleado",cascade = CascadeType.ALL)
    private List<PedidoVenta> listaPedidoVenta;

    private Rol tipoEmpleado;
}
