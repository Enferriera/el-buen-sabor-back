package com.example.buensaboruno.business.facade;

import com.example.buensaboruno.domain.dtos.ProvinciaDto;

public interface IProvinciaFacade extends IBaseFacade<ProvinciaDto,Long>{

    ProvinciaDto asignarPais(Long id, Long idPais);

}
