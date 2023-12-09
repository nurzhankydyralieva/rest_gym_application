package com.epam.xstack.mappers.trainee_mapper;

import com.epam.xstack.models.dto.trainee_dto.request.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.models.entity.Trainee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UpdateTraineeProfileRequestMapper {
    UpdateTraineeProfileRequestDTO toDto(Trainee trainee);

    Trainee toEntity(UpdateTraineeProfileRequestDTO requestDTO);

    List<UpdateTraineeProfileRequestDTO> toDtos(List<Trainee> trainees);

    List<Trainee> toEntities(List<UpdateTraineeProfileRequestDTO> requestDTOS);
}
