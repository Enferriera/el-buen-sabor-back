package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.FacturaDto;
import com.example.buensaboruno.domain.entities.Factura;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IFacturaMapper extends IBaseMapper<Factura, FacturaDto> {
    FacturaDto toDTO(Factura source);
    Factura toEntity(FacturaDto source);
    List<FacturaDto> toDTOsList(List<Factura> source);
    List<Factura> toEntitiesList(List<FacturaDto> source);
}