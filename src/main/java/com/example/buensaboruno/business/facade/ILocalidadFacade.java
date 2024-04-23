package com.example.buensaboruno.business.facade;

import com.example.buensaboruno.domain.dtos.LocalidadDto;

public interface ILocalidadFacade extends IBaseFacade<LocalidadDto,Long>{
    LocalidadDto asignarProvincia(Long id, Long idProvincia);
}
