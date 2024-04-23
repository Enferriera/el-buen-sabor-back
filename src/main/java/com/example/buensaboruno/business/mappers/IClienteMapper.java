package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.ClienteDto;
import com.example.buensaboruno.domain.entities.Cliente;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IClienteMapper extends IBaseMapper<Cliente, ClienteDto> {

    ClienteDto toDTO(Cliente source);
    Cliente toEntity(ClienteDto source);
    List<ClienteDto> toDTOsList(List<Cliente> source);
    List<Cliente> toEntitiesList(List<ClienteDto> source);
}