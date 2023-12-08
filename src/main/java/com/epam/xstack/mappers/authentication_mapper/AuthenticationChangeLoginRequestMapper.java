package com.epam.xstack.mappers.authentication_mapper;

import com.epam.xstack.models.dto.authentication.AuthenticationChangeLoginRequestDTO;
import com.epam.xstack.models.entity.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AuthenticationChangeLoginRequestMapper {
    @Mapping(target = "userName", source = "user.userName")
    @Mapping(target = "newPassword", source = "user.password")
    @Mapping(target = "oldPassword", source = "user.password")
    AuthenticationChangeLoginRequestDTO toDto(User user);

    @InheritInverseConfiguration
    User toEntity(AuthenticationChangeLoginRequestDTO requestDTO);

}
