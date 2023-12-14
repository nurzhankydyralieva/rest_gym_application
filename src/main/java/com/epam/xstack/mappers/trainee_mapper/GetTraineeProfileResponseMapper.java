package com.epam.xstack.mappers.trainee_mapper;

import com.epam.xstack.models.dto.trainee_dto.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.models.entity.Trainee;
import com.epam.xstack.models.entity.Trainer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface GetTraineeProfileResponseMapper {

    GetTraineeProfileResponseDTO toDto(Trainee trainee);

    Trainee toEntity(GetTraineeProfileResponseDTO requestDTO);

    List<GetTraineeProfileResponseDTO> toDtos(Collection<Trainee> trainees);

    List<Trainee> toEntities(List<GetTraineeProfileResponseDTO> requestDTOS);
}
