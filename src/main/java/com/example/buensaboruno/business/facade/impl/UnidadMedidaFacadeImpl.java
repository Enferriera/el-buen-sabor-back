package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.domain.dtos.UnidadMedidaDto;
import com.example.buensaboruno.domain.entities.UnidadMedida;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaFacadeImpl extends BaseFacadeImpl<UnidadMedida, UnidadMedidaDto,Long>{
    public UnidadMedidaFacadeImpl(IBaseService<UnidadMedida, Long> baseService, IBaseMapper<UnidadMedida, UnidadMedidaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
