package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.PromocionDto;
import com.example.buensaboruno.domain.entities.Promocion;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IPromocionMapper extends IBaseMapper<Promocion, PromocionDto> {

    PromocionDto toDTO(Promocion source);
    Promocion toEntity(PromocionDto source);
    List<PromocionDto> toDTOsList(List<Promocion> source);
    List<Promocion> toEntitiesList(List<PromocionDto> source);
}
