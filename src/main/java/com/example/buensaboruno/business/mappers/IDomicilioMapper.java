package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.DomicilioDto;
import com.example.buensaboruno.domain.entities.Domicilio;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IDomicilioMapper extends IBaseMapper<Domicilio, DomicilioDto> {


    DomicilioDto toDTO(Domicilio source);
    Domicilio toEntity(DomicilioDto source);
    List<DomicilioDto> toDTOsList(List<Domicilio> source);
    List<Domicilio> toEntitiesList(List<DomicilioDto> source);
}