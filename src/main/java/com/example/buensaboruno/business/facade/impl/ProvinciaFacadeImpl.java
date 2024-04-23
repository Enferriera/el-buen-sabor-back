package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.IProvinciaFacade;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.business.services.IProvinciaService;
import com.example.buensaboruno.domain.dtos.ProvinciaDto;
import com.example.buensaboruno.domain.entities.Provincia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaFacadeImpl extends BaseFacadeImpl<Provincia, ProvinciaDto,Long> implements IProvinciaFacade {
    public ProvinciaFacadeImpl(IBaseService<Provincia, Long> baseService, IBaseMapper<Provincia, ProvinciaDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IProvinciaService provinciaService;

    @Override
    public ProvinciaDto asignarPais(Long id, Long idPais) {
        return baseMapper.toDTO(provinciaService.asignarPais(id,idPais));
    }

}
