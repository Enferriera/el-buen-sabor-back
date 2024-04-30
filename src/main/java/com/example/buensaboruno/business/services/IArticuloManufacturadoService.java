package com.example.buensaboruno.business.services;

import com.example.buensaboruno.domain.entities.ArticuloManufacturado;

import java.util.List;

public interface IArticuloManufacturadoService extends IArticuloService<ArticuloManufacturado,Long>{
    ArticuloManufacturado asignarImagenes(Long id, List<Long> imagenesIds);
    ArticuloManufacturado removerImagenes(Long id, List<Long> imagenesIds);
    ArticuloManufacturado asignarUnidadMedida(Long id, Long unidadMedidaId);

}
