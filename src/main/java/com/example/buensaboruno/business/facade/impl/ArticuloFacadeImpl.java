package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.IArticuloFacade;
import com.example.buensaboruno.business.facade.IBaseFacade;
import com.example.buensaboruno.business.mappers.IArticuloManufacturadoDetalleMapper;
import com.example.buensaboruno.business.mappers.IArticuloMapper;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IArticuloService;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.domain.dtos.ArticuloDto;
import com.example.buensaboruno.domain.dtos.BaseDto;
import com.example.buensaboruno.domain.entities.Articulo;
import com.example.buensaboruno.domain.entities.Base;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public abstract class ArticuloFacadeImpl<E extends Articulo,D extends ArticuloDto,ID extends Serializable> implements IArticuloFacade<D,ID> {
    protected IArticuloService<E,ID> articuloService;
    protected IArticuloMapper<E,D> articuloMapper;

    public ArticuloFacadeImpl(IArticuloService<E,ID> articuloService, IArticuloMapper<E,D> articuloMapper) {
        this.articuloService = articuloService;
        this.articuloMapper = articuloMapper;
    }

    public D createNew(D request){
        // Convierte a entidad
        var entityToCreate = articuloMapper.toEntity(request);
        // Graba una entidad
        var entityCreated = articuloService.save(entityToCreate);
        // convierte a Dto para devolver
        return articuloMapper.toDTO(entityCreated);
    }

    public D getById(ID id){
        // Busca una entidad por id
        var entity = articuloService.findById(id);
        // convierte la entidad a DTO
        return articuloMapper.toDTO(entity);
    }

    public List<D> getAll(){
        // trae una lista de entidades
        var entities = articuloService.findAll();
        //  devuelve una lista de DTO
        return entities
                .stream()
                .map(articuloMapper::toDTO)
                .collect(Collectors.toList());
    }

    public void deleteById(ID id){
        var entity = articuloService.findById(id);
        articuloService.delete(id);
    }

    public D update(D request, ID id){
        var entityToUpdate = articuloMapper.toEntity(request);
        var entityUpdated = articuloService.update(entityToUpdate);
        return articuloMapper.toDTO(entityUpdated);
    }

}
