package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.ProvinciaDto;
import com.example.buensaboruno.domain.entities.Provincia;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IProvinciaMapper extends IBaseMapper<Provincia, ProvinciaDto> {
    ProvinciaDto toDTO(Provincia source);
    Provincia toEntity(ProvinciaDto source);
    List<ProvinciaDto> toDTOsList(List<Provincia> source);
    List<Provincia> toEntitiesList(List<ProvinciaDto> source);
}