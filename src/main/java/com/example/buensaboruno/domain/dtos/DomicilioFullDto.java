package com.example.buensaboruno.domain.dtos;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DomicilioFullDto extends BaseFullDto {
    private String calle;
    private int numero;
    private int cp;

    private LocalidadFullDto localidad;

    private SucursalEmpresaFullDto sucursalEmpresa;
}
