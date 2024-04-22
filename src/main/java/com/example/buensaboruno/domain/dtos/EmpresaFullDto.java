package com.example.buensaboruno.domain.dtos;




import lombok.*;

import java.util.HashSet;
import java.util.Set;




@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class EmpresaFullDto extends BaseFullDto {
    private String nombre;
    private String razonSocial;
    private Integer cuil;


    private Set<SucursalFullDto> listaSucursal= new HashSet<>();

}
