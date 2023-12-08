package com.epam.xstack.mappers.authentication_mapper;

import com.epam.xstack.models.dto.authentication.AuthenticationRequestDTO;
import com.epam.xstack.models.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthenticationRequestMapper {
    AuthenticationRequestDTO toDto(User user);

    User toEntity(AuthenticationRequestDTO requestDTO);
}