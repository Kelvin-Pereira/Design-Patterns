package com.kodex.exemplos.api.user.domain.mapper;

import com.kodex.exemplos.api.user.domain.dto.UserDTO;
import com.kodex.exemplos.api.user.domain.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toDTO(UserEntity user);

    @InheritInverseConfiguration
    UserEntity toEntity(UserDTO userDTO);

}
