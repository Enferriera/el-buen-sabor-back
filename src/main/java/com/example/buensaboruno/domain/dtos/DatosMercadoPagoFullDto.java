package com.example.buensaboruno.domain.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DatosMercadoPagoFullDto extends BaseFullDto {
    private LocalDate date_created;
    private LocalDate date_aproved;
    private LocalDate date_last_update;
    private int payment_type_id;
    private String payment_method_id;
    private String status;
    private String status_detail;

    private FacturaVentaFullDto facturaVenta;
}