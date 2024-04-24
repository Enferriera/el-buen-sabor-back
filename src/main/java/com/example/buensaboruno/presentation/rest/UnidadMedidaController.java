package com.example.buensaboruno.presentation.rest;

import com.example.buensaboruno.business.facade.impl.UnidadMedidaFacadeImpl;
import com.example.buensaboruno.domain.dtos.UnidadMedidaDto;
import com.example.buensaboruno.domain.entities.UnidadMedida;
import com.example.buensaboruno.presentation.rest.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidadesMedidas")
public class UnidadMedidaController extends BaseControllerImpl<UnidadMedida, UnidadMedidaDto,Long, UnidadMedidaFacadeImpl> {
    public UnidadMedidaController(UnidadMedidaFacadeImpl facade) {
        super(facade);
    }
}
