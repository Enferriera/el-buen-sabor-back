package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.IArticuloManufacturadoDetalleFacade;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.domain.dtos.ArticuloManufacturadoDetalleDto;
import com.example.buensaboruno.domain.dtos.CategoriaDto;
import com.example.buensaboruno.domain.dtos.LocalidadDto;
import com.example.buensaboruno.domain.entities.ArticuloManufacturadoDetalle;
import com.example.buensaboruno.domain.entities.Categoria;
import com.example.buensaboruno.domain.entities.Localidad;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticuloManufacturadoDetalleFacadeImpl extends BaseFacadeImpl<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleDto,Long>  implements IArticuloManufacturadoDetalleFacade {

    public ArticuloManufacturadoDetalleFacadeImpl(IBaseService<ArticuloManufacturadoDetalle, Long> baseService, IBaseMapper<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
