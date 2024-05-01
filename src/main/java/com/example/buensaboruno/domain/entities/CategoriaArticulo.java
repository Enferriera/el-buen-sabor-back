package com.example.buensaboruno.domain.entities;

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
public class CategoriaArticulo  extends Base{
    private String denominacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoriaArticuloPadre_id")
    private CategoriaArticulo categoriaArticuloPadre/*=null*/;

    @OneToMany(mappedBy = "categoriaArticuloPadre", cascade = CascadeType.ALL)
    private List<CategoriaArticulo> listaCategoriaArticulo;

    //una categoria puede tener muchos articulos??
    @ManyToOne
    @JoinColumn(name="articuloInsumo_id")
    private ArticuloInsumo articuloInsumo;
}
