package com.example.buensaboruno.business.services;

import com.example.buensaboruno.domain.entities.Pedido;

public interface IPedidoService extends IBaseService<Pedido,Long>{
    Pedido create(Pedido entity, Long domicilioId, Long sucursalId);
}
