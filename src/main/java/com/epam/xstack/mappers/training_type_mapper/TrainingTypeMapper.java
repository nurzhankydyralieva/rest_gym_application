package com.epam.xstack.mappers.training_type_mapper;

import com.epam.xstack.models.dto.training_type.TrainingTypeDTO;
import com.epam.xstack.models.entity.TrainingType;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TrainingTypeMapper {
    TrainingTypeDTO toDto(TrainingType trainingType);

    TrainingType toEntity(TrainingTypeDTO requestDTO);

    List<TrainingType> toEntities(List<TrainingTypeDTO> requestDTOS);


    List<TrainingTypeDTO> toDtos(List<TrainingType> trainingType);


}
