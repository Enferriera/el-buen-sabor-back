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
public class Provincia extends Base {
    private String nombre;
    @ManyToOne
    @JoinColumn(name="pais_id",referencedColumnName = "id")
    private Pais pais;
    @OneToMany(mappedBy = "provincia", cascade = CascadeType.ALL)
    private List<Localidad> listaLocalidades;
}
