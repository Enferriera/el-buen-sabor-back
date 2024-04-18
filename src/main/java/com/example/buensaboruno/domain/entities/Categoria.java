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
public class Categoria extends Base{
    private String denominacion;

    @OneToMany
    @JoinColumn(name="categoria_id")
    @Builder.Default
    private Set<Categoria> listaCategoria= new HashSet<>();


    @OneToMany
    @JoinColumn(name="categoria_id")
    @Builder.Default
    private Set<ArticuloInsumo> listaArticuloInsumo=new HashSet<>();

    @OneToMany
    @JoinColumn(name="categoria_id")
    @Builder.Default
    private Set<ArticuloManufacturado> listaArticuloManufacturado=new HashSet<>();


}
