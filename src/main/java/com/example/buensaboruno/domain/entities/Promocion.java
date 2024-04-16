package com.example.buensaboruno.domain.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Promocion  extends Base{
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private double descuento;
    @OneToMany(cascade = CascadeType.ALL)
    private List<PromocionDetalle> listaPromocionDetalle=new ArrayList<>();
}
