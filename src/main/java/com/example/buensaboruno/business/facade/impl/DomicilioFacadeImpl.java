package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.IDomicilioFacade;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.business.services.IDomicilioService;
import com.example.buensaboruno.domain.dtos.DomicilioDto;
import com.example.buensaboruno.domain.entities.Domicilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioFacadeImpl extends BaseFacadeImpl<Domicilio, DomicilioDto,Long> implements IDomicilioFacade {
    public DomicilioFacadeImpl(IBaseService<Domicilio, Long> baseService, IBaseMapper<Domicilio, DomicilioDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IDomicilioService domicilioService;

    @Override
    public DomicilioDto asignarLocalidad(Long id, Long idLocalidad) {
        return baseMapper.toDTO(domicilioService.asignarLocalidad(id,idLocalidad));
    }
}
