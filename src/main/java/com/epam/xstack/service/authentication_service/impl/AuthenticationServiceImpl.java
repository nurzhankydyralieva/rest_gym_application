package com.epam.xstack.service.authentication_service.impl;


import com.epam.xstack.dao.authentication_dao.AuthenticationDAO;
import com.epam.xstack.models.dto.authentication.AuthenticationRequestDTO;
import com.epam.xstack.models.dto.authentication.AuthenticationResponseDTO;
import com.epam.xstack.service.authentication_service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final AuthenticationDAO authenticationDAO;

    @Override
    public AuthenticationResponseDTO authenticateLogin(UUID id, AuthenticationRequestDTO requestDTO) {
        return authenticationDAO.authenticateLogin(id, requestDTO);
    }

}
