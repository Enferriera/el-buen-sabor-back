package com.example.buensaboruno.domain.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Domicilio extends Base{
    private String calle;
    private int numero;
    private int cp;

    @ManyToOne
    private Localidad localidad;



}
