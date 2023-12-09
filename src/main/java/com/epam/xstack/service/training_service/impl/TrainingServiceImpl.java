package com.epam.xstack.service.training_service.impl;

import com.epam.xstack.dao.training_dao.TrainingDAO;
import com.epam.xstack.models.dto.training_dto.request.TrainingRequestDTO;
import com.epam.xstack.models.dto.training_dto.response.TrainingResponseDTO;
import com.epam.xstack.service.training_service.TrainingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrainingServiceImpl implements TrainingService {
    private final TrainingDAO trainingDAO;

    @Override
    public TrainingResponseDTO saveTraining(TrainingRequestDTO requestDTO) {
        return trainingDAO.saveTraining(requestDTO);
    }
}
