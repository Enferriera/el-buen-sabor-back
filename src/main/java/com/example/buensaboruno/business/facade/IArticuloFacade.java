package com.example.buensaboruno.business.facade;

import com.example.buensaboruno.domain.dtos.ArticuloDto;

import java.io.Serializable;
import java.util.List;

public interface IArticuloFacade<D extends ArticuloDto, ID extends Serializable> {
    D createNew(D request);
    D getById(Long id);
    List<D> getAll();
    void deleteById(Long id);
    D update(D request, Long id);
}
