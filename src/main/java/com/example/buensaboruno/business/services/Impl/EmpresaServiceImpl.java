package com.example.buensaboruno.business.services.Impl;

import com.example.buensaboruno.business.services.IEmpresaService;
import com.example.buensaboruno.domain.entities.Empresa;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa,Long> implements IEmpresaService {
}
