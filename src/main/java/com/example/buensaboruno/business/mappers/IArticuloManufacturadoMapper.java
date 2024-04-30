package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.ArticuloManufacturadoDto;
import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IArticuloManufacturadoMapper extends IArticuloMapper<ArticuloManufacturado, ArticuloManufacturadoDto>{

    ArticuloManufacturadoDto toDTO(ArticuloManufacturado source);
    ArticuloManufacturado toEntity(ArticuloManufacturadoDto source);
    List<ArticuloManufacturadoDto> toDTOsList(List<ArticuloManufacturado> source);
    List<ArticuloManufacturado> toEntitiesList(List<ArticuloManufacturadoDto> source);
}