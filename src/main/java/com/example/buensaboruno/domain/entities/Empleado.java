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
public class Empleado extends Base{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private Rol perfil;

    @ManyToOne
    @JoinColumn(name = "sucursalEmpresa_id")
    private SucursalEmpresa sucursalEmpresa;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "empleado",cascade = CascadeType.ALL)
    private List<PedidoVenta> listaPedidoVenta;
}
