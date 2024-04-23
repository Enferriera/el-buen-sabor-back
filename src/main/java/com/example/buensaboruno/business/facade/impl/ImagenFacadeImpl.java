package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.IImagenFacade;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.domain.dtos.ImagenDto;
import com.example.buensaboruno.domain.entities.Imagen;
import org.springframework.stereotype.Service;

@Service
public class ImagenFacadeImpl extends BaseFacadeImpl<Imagen, ImagenDto,Long> implements IImagenFacade {
    public ImagenFacadeImpl(IBaseService<Imagen, Long> baseService, IBaseMapper<Imagen, ImagenDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
