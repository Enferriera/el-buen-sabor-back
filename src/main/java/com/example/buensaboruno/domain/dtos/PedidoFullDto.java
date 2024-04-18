package com.example.buensaboruno.domain.dtos;

import com.example.buensaboruno.domain.enums.Estado;
import com.example.buensaboruno.domain.enums.FormaPago;
import com.example.buensaboruno.domain.enums.TipoEnvio;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class PedidoFullDto extends BaseFullDto{
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;


    private DomicilioFullDto domicilio;



    private FacturaFullDto factura;

    private Set<DetallePedidoFullDto> detallePedidos = new HashSet<>();

}
