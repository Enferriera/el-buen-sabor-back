package com.example.buensaboruno.business.services;

import com.example.buensaboruno.domain.entities.Cliente;

import java.util.List;

public interface IClienteService extends IPersonaService<Cliente,Long>{
    Cliente asignarUsuario(Long id, Long idUsuario);
    Cliente asignarImagen(Long id, Long idImagen);
    Cliente asignarPedidos(Long id, List<Long> pedidosIds);
    Cliente removerPedidos(Long id, List<Long> pedidosIds);
    Cliente asignarDomicilios(Long id, List<Long> domiciliosIds);
    Cliente removerDomicilios(Long id, List<Long> domiciliosIds);
}
