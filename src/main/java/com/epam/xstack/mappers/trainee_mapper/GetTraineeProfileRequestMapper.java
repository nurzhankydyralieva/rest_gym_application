package com.epam.xstack.mappers.trainee_mapper;

import com.epam.xstack.models.dto.trainee.request.GetTraineeProfileRequestDTO;
import com.epam.xstack.models.entity.Trainee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GetTraineeProfileRequestMapper {
    GetTraineeProfileRequestDTO toDto(Trainee trainee);

    Trainee toEntity(GetTraineeProfileRequestDTO requestDTO);

    List<GetTraineeProfileRequestDTO> toDtos(List<Trainee> trainees);

    List<Trainee> toEntities(List<GetTraineeProfileRequestDTO> requestDTOS);
}