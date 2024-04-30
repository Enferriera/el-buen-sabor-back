package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.IArticuloManufacturadoFacade;
import com.example.buensaboruno.business.mappers.IArticuloMapper;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IArticuloManufacturadoService;
import com.example.buensaboruno.business.services.IArticuloService;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.domain.dtos.ArticuloManufacturadoDto;
import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloManufacturadoFacadeImpl extends ArticuloFacadeImpl<ArticuloManufacturado, ArticuloManufacturadoDto,Long> implements IArticuloManufacturadoFacade {
    public ArticuloManufacturadoFacadeImpl(IArticuloService<ArticuloManufacturado, Long> articuloService, IArticuloMapper<ArticuloManufacturado, ArticuloManufacturadoDto> articuloMapper) {
        super(articuloService, articuloMapper);
    }

    @Autowired
    private IArticuloManufacturadoService articuloManufacturadoService;

    @Override
    public ArticuloManufacturadoDto asignarImagenes(Long id, List<Long> imagenesIds) {
        return articuloMapper.toDTO(articuloManufacturadoService.asignarImagenes(id,imagenesIds));
    }

    @Override
    public ArticuloManufacturadoDto removerImagenes(Long id, List<Long> imagenesIds) {
        return articuloMapper.toDTO(articuloManufacturadoService.removerImagenes(id,imagenesIds));
    }

    @Override
    public ArticuloManufacturadoDto asignarUnidadMedida(Long id, Long unidadMedidaId) {
        return articuloMapper.toDTO(articuloManufacturadoService.asignarUnidadMedida(id,unidadMedidaId));
    }
}
