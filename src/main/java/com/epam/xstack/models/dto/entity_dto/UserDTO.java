package com.epam.xstack.models.dto.entity_dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private UUID id;

    private String firstName;

    private String lastName;

    private String userName;

    private String password;

    private Boolean isActive;

    private String criteria;

    private Boolean isAssigned;
}
