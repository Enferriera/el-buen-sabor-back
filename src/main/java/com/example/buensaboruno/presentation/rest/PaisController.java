package com.example.buensaboruno.presentation.rest;

import com.example.buensaboruno.business.facade.impl.PaisFacadeImpl;
import com.example.buensaboruno.domain.dtos.PaisDto;
import com.example.buensaboruno.domain.entities.Pais;
import com.example.buensaboruno.presentation.rest.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisController extends BaseControllerImpl<Pais, PaisDto,Long, PaisFacadeImpl> {
    public PaisController(PaisFacadeImpl facade) {
        super(facade);
    }

}
