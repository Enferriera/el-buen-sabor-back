package com.example.buensaboruno.business.services;

import com.example.buensaboruno.domain.entities.ArticuloInsumo;

import java.util.List;

public interface IArticuloInsumoService extends IArticuloService<ArticuloInsumo, Long> {
    ArticuloInsumo asignarImagenes(Long id, List<Long> imagenesIds);
    ArticuloInsumo removerImagenes(Long id, List<Long> imagenesIds);
    ArticuloInsumo asignarUnidadMedida(Long id, Long unidadMedidaId);
}
