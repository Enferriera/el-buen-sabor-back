package com.example.buensaboruno.presentation.rest;

import com.example.buensaboruno.business.facade.impl.PedidoFacadeImpl;
import com.example.buensaboruno.domain.dtos.PedidoDto;
import com.example.buensaboruno.domain.entities.Pedido;
import com.example.buensaboruno.presentation.rest.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoDto,Long, PedidoFacadeImpl> {
    public PedidoController(PedidoFacadeImpl facade) {
        super(facade);
    }


}