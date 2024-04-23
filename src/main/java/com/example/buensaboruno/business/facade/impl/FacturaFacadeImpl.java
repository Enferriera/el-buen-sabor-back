package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.IFacturaFacade;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.domain.dtos.FacturaDto;
import com.example.buensaboruno.domain.entities.Factura;
import org.springframework.stereotype.Service;

@Service
public class FacturaFacadeImpl extends BaseFacadeImpl<Factura, FacturaDto,Long> implements IFacturaFacade {
    public FacturaFacadeImpl(IBaseService<Factura, Long> baseService, IBaseMapper<Factura, FacturaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
