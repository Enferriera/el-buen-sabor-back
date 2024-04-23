package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.ImagenDto;
import com.example.buensaboruno.domain.entities.Imagen;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IImagenMapper extends IBaseMapper<Imagen, ImagenDto> {
    ImagenDto toDTO(Imagen source);
    Imagen toEntity(ImagenDto source);
    List<ImagenDto> toDTOsList(List<Imagen> source);
    List<Imagen> toEntitiesList(List<ImagenDto> source);
}