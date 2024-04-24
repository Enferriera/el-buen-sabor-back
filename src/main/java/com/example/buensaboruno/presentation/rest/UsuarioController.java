package com.example.buensaboruno.presentation.rest;

import com.example.buensaboruno.business.facade.impl.UsuarioFacadeImpl;
import com.example.buensaboruno.domain.dtos.UsuarioDto;
import com.example.buensaboruno.domain.entities.Usuario;
import com.example.buensaboruno.presentation.rest.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioDto,Long, UsuarioFacadeImpl> {
    public UsuarioController(UsuarioFacadeImpl facade) {
        super(facade);
    }

}
