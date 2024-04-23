package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.EmpresaDto;
import com.example.buensaboruno.domain.entities.Empresa;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IEmpresaMapper extends IBaseMapper<Empresa, EmpresaDto> {

    EmpresaDto toDTO(Empresa source);
    Empresa toEntity(EmpresaDto source);
    List<EmpresaDto> toDTOsList(List<Empresa> source);
    List<Empresa> toEntitiesList(List<EmpresaDto> source);
}