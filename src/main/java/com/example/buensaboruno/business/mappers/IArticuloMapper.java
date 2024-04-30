package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.ArticuloDto;

import com.example.buensaboruno.domain.entities.Articulo;


import java.util.List;

public interface IArticuloMapper<E extends Articulo,D extends ArticuloDto> {
    D toDTO(E source);
    E toEntity(D source);
    List<D> toDTOsList(List<E> source);
    List<E> toEntitiesList(List<D> source);
}
