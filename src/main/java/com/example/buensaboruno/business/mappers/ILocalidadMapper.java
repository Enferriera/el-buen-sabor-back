package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.LocalidadDto;
import com.example.buensaboruno.domain.entities.Localidad;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ILocalidadMapper extends IBaseMapper<Localidad, LocalidadDto> {
    LocalidadDto toDTO(Localidad source);
    Localidad toEntity(LocalidadDto source);
    List<LocalidadDto> toDTOsList(List<Localidad> source);
    List<Localidad> toEntitiesList(List<LocalidadDto> source);
}