package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.IArticuloInsumoFacade;
import com.example.buensaboruno.business.mappers.IArticuloMapper;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IArticuloInsumoService;
import com.example.buensaboruno.business.services.IArticuloService;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.domain.dtos.ArticuloInsumoDto;
import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloInsumoFacadeImpl extends ArticuloFacadeImpl<ArticuloInsumo, ArticuloInsumoDto,Long> implements IArticuloInsumoFacade {
    public ArticuloInsumoFacadeImpl(IArticuloService<ArticuloInsumo, Long> articuloService, IArticuloMapper<ArticuloInsumo, ArticuloInsumoDto> articuloMapper) {
        super(articuloService, articuloMapper);
    }

    @Autowired
    private IArticuloInsumoService articuloInsumoService;

    @Override
    public ArticuloInsumoDto asignarImagenes(Long id, List<Long> imagenesIds) {
        return articuloMapper.toDTO(articuloInsumoService.asignarImagenes(id,imagenesIds));
    }

    @Override
    public ArticuloInsumoDto removerImagenes(Long id, List<Long> imagenesIds) {
        return articuloMapper.toDTO(articuloInsumoService.removerImagenes(id,imagenesIds));
    }

    @Override
    public ArticuloInsumoDto asignarUnidadMedida(Long id, Long unidadMedidaId) {
        return articuloMapper.toDTO(articuloInsumoService.asignarUnidadMedida(id,unidadMedidaId));
    }

}
