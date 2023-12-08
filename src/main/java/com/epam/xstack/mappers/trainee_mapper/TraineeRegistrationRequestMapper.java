package com.epam.xstack.mappers.trainee_mapper;

import com.epam.xstack.models.dto.trainee.request.TraineeRegistrationRequestDTO;
import com.epam.xstack.models.entity.Trainee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TraineeRegistrationRequestMapper {
    TraineeRegistrationRequestDTO toDto(Trainee trainee);

    Trainee toEntity(TraineeRegistrationRequestDTO requestDTO);

    List<TraineeRegistrationRequestDTO> toDtos(List<Trainee> trainees);

    List<Trainee> toEntities(List<TraineeRegistrationRequestDTO> requestDTOS);

}
