package com.epam.xstack.dao.training_dao;

import com.epam.xstack.models.dto.training_dto.request.AddTrainingRequestDTO;
import com.epam.xstack.models.dto.training_dto.response.AddTrainingResponseDTO;

public interface TrainingDAO {
     AddTrainingResponseDTO saveTraining(AddTrainingRequestDTO requestDTO);
    AddTrainingRequestDTO saveTrainingTo(AddTrainingRequestDTO requestDTO);
}
