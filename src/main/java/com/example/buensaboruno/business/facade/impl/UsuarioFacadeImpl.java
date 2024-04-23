package com.example.buensaboruno.business.facade.impl;

import com.example.buensaboruno.business.facade.IUsuarioFacade;
import com.example.buensaboruno.business.mappers.IBaseMapper;
import com.example.buensaboruno.business.services.IBaseService;
import com.example.buensaboruno.domain.dtos.UsuarioDto;
import com.example.buensaboruno.domain.entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioFacadeImpl extends BaseFacadeImpl<Usuario, UsuarioDto,Long> implements IUsuarioFacade {

    public UsuarioFacadeImpl(IBaseService<Usuario, Long> baseService, IBaseMapper<Usuario,UsuarioDto> baseMapper) {
        super(baseService, baseMapper);
    }

}
