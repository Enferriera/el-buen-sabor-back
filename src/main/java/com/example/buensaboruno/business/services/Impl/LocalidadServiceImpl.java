package com.example.buensaboruno.business.services.Impl;

import com.example.buensaboruno.business.services.ILocalidadService;
import com.example.buensaboruno.business.services.IProvinciaService;
import com.example.buensaboruno.domain.entities.Localidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements ILocalidadService {
    @Autowired
    private IProvinciaService provinciaService;

    @Override
    public Localidad asignarProvincia(Long id, Long idProvincia) {
        var localidad = findById(id);
        var provincia = provinciaService.findById(idProvincia);
        localidad.setProvincia(provincia);
        return update(localidad);
    }
}
