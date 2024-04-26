package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.CategoriaDto;
import com.example.buensaboruno.domain.entities.Categoria;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICategoriaMapper extends IBaseMapper<Categoria, CategoriaDto> {

    CategoriaDto toDTO(Categoria source);
    Categoria toEntity(CategoriaDto source);
    List<CategoriaDto> toDTOsList(List<Categoria> source);
    List<Categoria> toEntitiesList(List<CategoriaDto> source);
}
