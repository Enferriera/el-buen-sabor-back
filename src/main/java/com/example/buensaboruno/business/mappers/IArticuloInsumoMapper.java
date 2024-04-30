package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.ArticuloInsumoDto;
import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IArticuloInsumoMapper extends IArticuloMapper<ArticuloInsumo, ArticuloInsumoDto> {

    ArticuloInsumoDto toDTO(ArticuloInsumo source);
    ArticuloInsumo toEntity(ArticuloInsumoDto source);
    List<ArticuloInsumoDto> toDTOsList(List<ArticuloInsumo> source);
    List<ArticuloInsumo> toEntitiesList(List<ArticuloInsumoDto> source);
}