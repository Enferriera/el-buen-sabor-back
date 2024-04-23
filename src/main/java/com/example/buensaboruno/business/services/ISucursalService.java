package com.example.buensaboruno.business.services;

import com.example.buensaboruno.domain.entities.Sucursal;

import java.util.List;

public interface ISucursalService extends IBaseService<Sucursal,Long>{
    Sucursal asignarDomicilio(Long id, Long idDomicilio);
    Sucursal asignarCategorias(Long id, List<Long> categoriasIds);
    Sucursal removerCategorias(Long id, List<Long> categoriasIds);
    Sucursal asignarPromociones(Long id, List<Long> promocionesIds);
    Sucursal removerPromociones(Long id, List<Long> promocionesIds);
}
