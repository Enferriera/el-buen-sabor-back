package com.example.buensaboruno.domain.dtos;

import com.example.buensaboruno.domain.enums.FormaPago;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class FacturaFullDto extends BaseFullDto {
    private LocalDate fechaFcturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private Double totalVenta;

}
