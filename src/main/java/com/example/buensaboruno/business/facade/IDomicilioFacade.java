package com.example.buensaboruno.business.facade;

import com.example.buensaboruno.domain.dtos.DomicilioDto;

public interface IDomicilioFacade extends IBaseFacade<DomicilioDto,Long>{
    DomicilioDto asignarLocalidad(Long id, Long idLocalidad);
}
