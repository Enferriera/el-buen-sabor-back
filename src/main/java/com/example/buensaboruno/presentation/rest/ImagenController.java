package com.example.buensaboruno.presentation.rest;

import com.example.buensaboruno.business.facade.impl.ImagenFacadeImpl;
import com.example.buensaboruno.domain.dtos.ImagenDto;
import com.example.buensaboruno.domain.entities.Imagen;
import com.example.buensaboruno.presentation.rest.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagenes")
public class ImagenController extends BaseControllerImpl<Imagen, ImagenDto,Long, ImagenFacadeImpl> {
    public ImagenController(ImagenFacadeImpl facade) {
        super(facade);
    }
}
