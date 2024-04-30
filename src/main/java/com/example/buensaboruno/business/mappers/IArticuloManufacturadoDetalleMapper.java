package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.ArticuloManufacturadoDetalleDto;

import com.example.buensaboruno.domain.entities.ArticuloManufacturadoDetalle;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IArticuloManufacturadoDetalleMapper extends IBaseMapper<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleDto>{
}
