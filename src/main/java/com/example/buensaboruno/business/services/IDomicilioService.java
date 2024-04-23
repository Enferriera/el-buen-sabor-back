package com.example.buensaboruno.business.services;

import com.example.buensaboruno.domain.entities.Domicilio;

public interface IDomicilioService extends IBaseService<Domicilio,Long>{
    Domicilio asignarLocalidad(Long id, Long idLocalidad);
}
