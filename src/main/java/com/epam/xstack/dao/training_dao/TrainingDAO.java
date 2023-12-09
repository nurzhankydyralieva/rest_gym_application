package com.epam.xstack.dao.training_dao;

import com.epam.xstack.models.dto.training_dto.request.TrainingRequestDTO;
import com.epam.xstack.models.dto.training_dto.response.TrainingResponseDTO;

public interface TrainingDAO {
     TrainingResponseDTO saveTraining(TrainingRequestDTO requestDTO);
    TrainingRequestDTO saveTrainingTo(TrainingRequestDTO requestDTO);
}
