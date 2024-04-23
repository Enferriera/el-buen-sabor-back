package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.IPaisFacade;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.domain.dtos.PaisDto;
import com.example.buensaboruno.domain.entities.Pais;
import org.springframework.stereotype.Service;

@Service
public class PaisFacadeImpl extends BaseFacadeImpl<Pais, PaisDto,Long> implements IPaisFacade {

    public PaisFacadeImpl(IBaseService<Pais, Long> baseService, IBaseMapper<Pais, PaisDto> baseMapper) {
        super(baseService, baseMapper);
    }

}
