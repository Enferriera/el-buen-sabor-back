package com.example.buensaboruno.domain.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
public class UnidadMedida extends Base{

    private String denominacion;
    @OneToMany(mappedBy = "unidadMedida", cascade = CascadeType.ALL)
    private List<ArticuloInsumo> listaArticuloInsumo;
}
