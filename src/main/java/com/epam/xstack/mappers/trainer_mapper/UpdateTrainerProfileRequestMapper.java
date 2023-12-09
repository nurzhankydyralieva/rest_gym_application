package com.epam.xstack.mappers.trainer_mapper;

import com.epam.xstack.models.dto.trainer_dto.request.UpdateTrainerProfileRequestDTO;
import com.epam.xstack.models.entity.Trainer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UpdateTrainerProfileRequestMapper {
    UpdateTrainerProfileRequestDTO toDto(Trainer trainer);

    Trainer toEntity(UpdateTrainerProfileRequestDTO requestDTO);

    List<UpdateTrainerProfileRequestDTO> toDtos(List<Trainer> trainers);

    List<Trainer> toEntities(List<UpdateTrainerProfileRequestDTO> requestDTOS);
}
