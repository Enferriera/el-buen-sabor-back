package com.example.buensaboruno.business.services;

import com.example.buensaboruno.domain.entities.Empresa;

import java.util.List;

public interface IEmpresaService extends IBaseService<Empresa,Long>{
    Empresa asignarSucursales(Long id, List<Long> sucursalesIds);
    Empresa removerSucursales(Long id, List<Long> sucursalesIds);
}
