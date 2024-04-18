package com.example.buensaboruno.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Cliente extends Base{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    @OneToOne
    private Usuario usuario;

    @OneToMany
    @JoinColumn(name="cliente_id")
    private Set<Pedido> listaPedido=new HashSet<>();

}
