package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.CategoriaDto;
import com.example.buensaboruno.domain.entities.Categoria;

import java.util.List;

public interface ICategoriaMapper extends IBaseMapper<Categoria, CategoriaDto> {

    CategoriaDto toDTO(Categoria source);
    Categoria toEntity(CategoriaDto source);
    List<CategoriaDto> toDTOsList(List<Categoria> source);
    List<Categoria> toEntitiesList(List<CategoriaDto> source);
}
