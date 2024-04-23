package com.example.buensaboruno.business.services;

import com.example.buensaboruno.domain.entities.Provincia;

public interface IProvinciaService extends IBaseService<Provincia,Long> {
    Provincia asignarPais(Long id, Long idPais);
}
