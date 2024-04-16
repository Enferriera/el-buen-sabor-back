package com.example.buensaboruno.domain.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Domicilio extends Base{
    private String calle;
    private int numero;
    private int cp;
    @ManyToOne
    @JoinColumn(name="localidad_id")
    private Localidad localidad;
    @OneToOne(mappedBy = "domicilio")
    private SucursalEmpresa sucursalEmpresa;
}
