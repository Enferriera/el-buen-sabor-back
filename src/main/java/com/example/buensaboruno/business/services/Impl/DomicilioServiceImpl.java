package com.example.buensaboruno.business.services.Impl;

import com.example.buensaboruno.business.services.IDomicilioService;
import com.example.buensaboruno.business.services.ILocalidadService;
import com.example.buensaboruno.domain.entities.Domicilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements IDomicilioService {
    @Autowired
    private ILocalidadService localidadService;

    @Override
    public Domicilio asignarLocalidad(Long id, Long idLocalidad) {
        var domicilio = findById(id);
        var localidad = localidadService.findById(idLocalidad);
        domicilio.setLocalidad(localidad);
        return update(domicilio);
    }
}
