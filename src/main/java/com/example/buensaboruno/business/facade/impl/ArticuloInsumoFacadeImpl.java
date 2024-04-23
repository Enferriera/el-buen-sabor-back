package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.IArticuloInsumoFacade;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IArticuloInsumoService;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.domain.dtos.ArticuloInsumoDto;
import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloInsumoFacadeImpl extends BaseFacadeImpl<ArticuloInsumo, ArticuloInsumoDto,Long> implements IArticuloInsumoFacade {
    public ArticuloInsumoFacadeImpl(IBaseService<ArticuloInsumo, Long> baseService, IBaseMapper<ArticuloInsumo, ArticuloInsumoDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IArticuloInsumoService articuloInsumoService;

    @Override
    public ArticuloInsumoDto asignarImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(articuloInsumoService.asignarImagenes(id,imagenesIds));
    }

    @Override
    public ArticuloInsumoDto removerImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(articuloInsumoService.removerImagenes(id,imagenesIds));
    }

    @Override
    public ArticuloInsumoDto asignarUnidadMedida(Long id, Long unidadMedidaId) {
        return baseMapper.toDTO(articuloInsumoService.asignarUnidadMedida(id,unidadMedidaId));
    }

}
