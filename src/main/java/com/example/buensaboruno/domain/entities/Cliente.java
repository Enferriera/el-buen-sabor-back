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
public class Cliente extends Base{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    @OneToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name="domicilio_id")
    private Domicilio domicilio;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<PedidoVenta> listaPedidoVenta;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<FacturaVenta> listaFacturaVenta/*=new ArrayList<>()*/;
}
