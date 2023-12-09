package com.epam.xstack.mappers.training_mapper;

import com.epam.xstack.models.dto.training_dto.request.TrainingRequestDTO;
import com.epam.xstack.models.entity.Training;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TrainingMapper {


    @Mapping(source = "training.trainee", target = "traineeUserName")
    @Mapping(source = "training.trainer", target = "trainerUserName")
    TrainingRequestDTO toDto(Training training);

    @InheritInverseConfiguration
    Training toEntity(TrainingRequestDTO requestDTO);

    List<TrainingRequestDTO> toDtos(List<Training> trainings);

    List<Training> toEntities(List<TrainingRequestDTO> requestDTOS);
}

