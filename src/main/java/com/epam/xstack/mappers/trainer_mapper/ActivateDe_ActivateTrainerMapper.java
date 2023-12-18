package com.epam.xstack.mappers.trainer_mapper;

import com.epam.xstack.models.dto.trainer_dto.request.ActivateDe_ActivateTrainerDTO;
import com.epam.xstack.models.entity.Trainer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface ActivateDe_ActivateTrainerMapper {
    ActivateDe_ActivateTrainerDTO toDto(Trainer trainer);
    Trainer toEntity(ActivateDe_ActivateTrainerDTO dto);
}
