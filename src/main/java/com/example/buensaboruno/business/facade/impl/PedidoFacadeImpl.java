package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.IPedidoFacade;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.business.services.IPedidoService;
import com.example.buensaboruno.domain.dtos.PedidoDto;
import com.example.buensaboruno.domain.entities.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoFacadeImpl extends BaseFacadeImpl<Pedido,PedidoDto,Long> implements IPedidoFacade {

    public PedidoFacadeImpl(IBaseService<Pedido, Long> baseService, IBaseMapper<Pedido,PedidoDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IPedidoService pedidoService;

    @Override
    public PedidoDto createNew(PedidoDto request) {
        var entityToCreate = baseMapper.toEntity(request);
        var entityCreated = pedidoService.create(entityToCreate,request.getDomicilio().getId(),request.getSucursal().getId());
        return baseMapper.toDTO(entityCreated);
    }
}
