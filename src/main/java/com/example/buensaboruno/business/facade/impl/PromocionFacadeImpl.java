package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.IPromocionFacade;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.business.services.IPromocionService;
import com.example.buensaboruno.domain.dtos.PromocionDto;
import com.example.buensaboruno.domain.entities.Promocion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionFacadeImpl extends BaseFacadeImpl<Promocion, PromocionDto, Long> implements IPromocionFacade {
    public PromocionFacadeImpl(IBaseService<Promocion, Long> baseService, IBaseMapper<Promocion, PromocionDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IPromocionService promocionService;

    @Override
    public PromocionDto asignarImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(promocionService.asignarImagenes(id,imagenesIds));
    }

    @Override
    public PromocionDto removerImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(promocionService.removerImagenes(id,imagenesIds));
    }
}
