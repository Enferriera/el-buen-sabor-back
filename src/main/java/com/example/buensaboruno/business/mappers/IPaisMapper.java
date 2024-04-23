package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.PaisDto;
import com.example.buensaboruno.domain.entities.Pais;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IPaisMapper extends IBaseMapper<Pais, PaisDto> {
    PaisDto toDTO(Pais source);
    Pais toEntity(PaisDto source);
    List<PaisDto> toDTOsList(List<Pais> source);
    List<Pais> toEntitiesList(List<PaisDto> source);
}