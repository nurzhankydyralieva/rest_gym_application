package com.epam.xstack.dao.authentication_dao.impl;

import com.epam.xstack.dao.authentication_dao.AuthenticationDAO;
import com.epam.xstack.mappers.authentication_mapper.AuthenticationRequestMapper;
import com.epam.xstack.models.dto.authentication.AuthenticationRequestDTO;
import com.epam.xstack.models.dto.authentication.AuthenticationResponseDTO;
import com.epam.xstack.models.entity.User;
import com.epam.xstack.models.enums.Code;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
@RequiredArgsConstructor

public class AuthenticationDAOImpl implements AuthenticationDAO {
    private final SessionFactory sessionFactory;
    private final AuthenticationRequestMapper authenticationRequestMapper;

    @Override
    @Transactional
    public AuthenticationResponseDTO authenticateLogin(UUID id, AuthenticationRequestDTO requestDTO) {
        Session session = sessionFactory.getCurrentSession();
        User user = authenticationRequestMapper.toEntity(requestDTO);
        User userId = session.get(User.class, id);

        if (userId.getUserName().equals(user.getUserName()) && userId.getPassword().equals(user.getPassword())) {
            authenticationRequestMapper.toDto(user);
            return AuthenticationResponseDTO
                    .builder()
                    .response("Login response")
                    .code(Code.STATUS_200_OK)
                    .build();
        } else {
            throw new RuntimeException("Not available");
        }
    }
}
