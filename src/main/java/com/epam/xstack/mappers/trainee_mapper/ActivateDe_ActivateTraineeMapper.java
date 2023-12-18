package com.epam.xstack.mappers.trainee_mapper;

import com.epam.xstack.models.dto.trainee_dto.request.ActivateDe_ActivateTraineeDTO;
import com.epam.xstack.models.entity.Trainee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface ActivateDe_ActivateTraineeMapper {
    ActivateDe_ActivateTraineeDTO toDto(Trainee trainee);

    Trainee toEntity(ActivateDe_ActivateTraineeDTO dto);
}
