package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.ILocalidadFacade;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.business.services.ILocalidadService;
import com.example.buensaboruno.domain.dtos.LocalidadDto;
import com.example.buensaboruno.domain.entities.Localidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadFacadeImpl extends BaseFacadeImpl<Localidad, LocalidadDto,Long> implements ILocalidadFacade {
    public LocalidadFacadeImpl(IBaseService<Localidad, Long> baseService, IBaseMapper<Localidad, LocalidadDto> baseMapper) {
        super(baseService, baseMapper);
    }
    @Autowired
    private ILocalidadService localidadService;

    @Override
    public LocalidadDto asignarProvincia(Long id, Long idProvincia) {
        return baseMapper.toDTO(localidadService.asignarProvincia(id,idProvincia));
    }

}
