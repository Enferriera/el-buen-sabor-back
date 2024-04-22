package com.example.buensaboruno.business.services.Impl;

import com.example.buensaboruno.business.services.IUsuarioService;
import com.example.buensaboruno.domain.entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario,Long> implements IUsuarioService {
}
