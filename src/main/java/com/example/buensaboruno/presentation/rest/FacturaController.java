package com.example.buensaboruno.presentation.rest;

import com.example.buensaboruno.business.facade.impl.FacturaFacadeImpl;
import com.example.buensaboruno.domain.dtos.FacturaDto;
import com.example.buensaboruno.domain.entities.Factura;
import com.example.buensaboruno.presentation.rest.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facturas")
public class FacturaController extends BaseControllerImpl<Factura, FacturaDto,Long, FacturaFacadeImpl> {
    public FacturaController(FacturaFacadeImpl facade) {
        super(facade);
    }
}
