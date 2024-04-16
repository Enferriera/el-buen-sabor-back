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
public class Empresa extends Base{

    private String nombre;
    private String razonSocial;
    private int cuil;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<SucursalEmpresa> listaSucursalEmpresa;
}
