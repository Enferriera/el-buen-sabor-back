package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.ICategoriaFacade;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.business.services.ICategoriaService;
import com.example.buensaboruno.domain.dtos.CategoriaDto;
import com.example.buensaboruno.domain.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaFacadeImpl extends BaseFacadeImpl<Categoria, CategoriaDto,Long> implements ICategoriaFacade {
    @Autowired
    private ICategoriaService categoriaService;
    public CategoriaFacadeImpl(IBaseService<Categoria, Long> baseService, IBaseMapper<Categoria, CategoriaDto> baseMapper) {
        super(baseService, baseMapper);
    }




    @Override
    public CategoriaDto asignarSubcategorias(Long id, List<Long> subcategoriasIds) {
        return baseMapper.toDTO(categoriaService.asignarSubcategorias(id,subcategoriasIds));
    }

    @Override
    public CategoriaDto removerSubcategorias(Long id, List<Long> subcategoriasIds) {
        return baseMapper.toDTO(categoriaService.removerSubcategorias(id,subcategoriasIds));
    }

    @Override
    public CategoriaDto asignarArticulos(Long id, List<Long> articulosIds) {
        return baseMapper.toDTO(categoriaService.asignarArticulos(id,articulosIds));
    }

    @Override
    public CategoriaDto removerArticulos(Long id, List<Long> articulosIds) {
        return baseMapper.toDTO(categoriaService.removerArticulos(id,articulosIds));
    }

}
