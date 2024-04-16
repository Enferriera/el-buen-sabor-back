package com.example.buensaboruno.domain.dtos;

import com.example.buensaboruno.domain.entities.SucursalEmpresa;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpresaDto {
    private Long id;
    private String nombre;
    private String razonSocial;
    private int cuil;

    private List<SucursalEmpresaDto> listaSucursalEmpresa;
}
