package com.example.buensaboruno.business.services.Impl;

import com.example.buensaboruno.business.services.*;
import com.example.buensaboruno.domain.entities.Pedido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido,Long> implements IPedidoService {

    private static final Logger logger = LoggerFactory.getLogger(PedidoServiceImpl.class);

    @Autowired
    private IDomicilioService domicilioService;
    @Autowired
    private ISucursalService sucursalService;
    @Autowired
    private IArticuloManufacturadoService articuloManufacturadoService;
    @Autowired
    private IArticuloInsumoService articuloInsumoService;

    @Override
    public Pedido create(Pedido entity, Long domicilioId, Long sucursalId) {

        if(entity.getDetallePedidos().isEmpty()){
            String errMsg = "No se puede crear un pedido sin sus detalles";
            logger.error(errMsg);
            throw new RuntimeException(errMsg);
        }

        var domicilio = domicilioService.findById(domicilioId);
        var sucursal = sucursalService.findById(sucursalId);
        entity.setDomicilio(domicilio);
        entity.setSucursal(sucursal);

        return super.save(entity);

    }
}
