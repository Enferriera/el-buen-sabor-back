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
public class Pais extends Base{
    private String nombre;

    @OneToMany(mappedBy = "pais"/* ,cascade = CascadeType.ALL*/)
    private List<Provincia> listaProvincias;
}
