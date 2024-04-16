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
public class Localidad extends Base{
    private String nombre;
    @OneToMany(mappedBy = "domicilio",cascade = CascadeType.ALL)
    private List<Domicilio> listaDomicilios;
    @ManyToOne
    @JoinColumn(name="provincia_id")
    private Provincia provincia;

}
