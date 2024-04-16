package com.example.buensaboruno.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DatosMercadoPago extends Base{
    private LocalDate date_created;
    private LocalDate date_aproved;
    private LocalDate date_last_update;
    private int payment_type_id;
    private String payment_method_id;
    private String status;
    private String status_detail;
    @OneToOne(mappedBy = "datosMercadoPago")
    private FacturaVenta facturaVenta;
}
