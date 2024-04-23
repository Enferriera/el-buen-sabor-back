package com.example.buensaboruno.business.mappers;

import com.example.buensaboruno.domain.dtos.UsuarioDto;
import com.example.buensaboruno.domain.entities.Usuario;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IUsuarioMapper extends IBaseMapper<Usuario, UsuarioDto> {
    UsuarioDto toDTO(Usuario source);
    Usuario toEntity(UsuarioDto source);
    List<UsuarioDto> toDTOsList(List<Usuario> source);
    List<Usuario> toEntitiesList(List<UsuarioDto> source);
}