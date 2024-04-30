package com.example.buensaboruno.business.facade;

import com.example.buensaboruno.domain.dtos.ArticuloInsumoDto;

import java.util.List;


public interface IArticuloInsumoFacade extends IArticuloFacade<ArticuloInsumoDto,Long>{
    ArticuloInsumoDto asignarImagenes(Long id, List<Long> imagenesIds);
    ArticuloInsumoDto removerImagenes(Long id, List<Long> imagenesIds);
    ArticuloInsumoDto asignarUnidadMedida(Long id, Long unidadMedidaId);
}
