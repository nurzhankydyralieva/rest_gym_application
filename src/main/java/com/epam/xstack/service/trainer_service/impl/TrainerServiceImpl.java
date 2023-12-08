package com.epam.xstack.service.trainer_service.impl;

import com.epam.xstack.dao.trainer_dao.TrainerDAO;
import com.epam.xstack.models.dto.trainer.request.GetTrainerProfileRequestDTO;
import com.epam.xstack.models.dto.trainer.request.TrainerRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainer.request.UpdateTrainerProfileRequestDTO;
import com.epam.xstack.models.dto.trainer.response.GetTrainerProfileResponseDTO;
import com.epam.xstack.models.dto.trainer.response.TrainerRegistrationResponseDTO;
import com.epam.xstack.models.dto.trainer.response.UpdateTrainerProfileResponseDTO;
import com.epam.xstack.service.trainer_service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TrainerServiceImpl implements TrainerService {
    private final TrainerDAO trainerDAO;

    @Override
    public TrainerRegistrationResponseDTO saveTrainer(TrainerRegistrationRequestDTO requestDTO) {
        return trainerDAO.saveTrainer(requestDTO);
    }
    @Override
    public GetTrainerProfileResponseDTO selectTrainerProfileByUserName(UUID id, GetTrainerProfileRequestDTO requestDTO) {
        return trainerDAO.selectTrainerProfileByUserName(id, requestDTO);
    }
    @Override
    public UpdateTrainerProfileResponseDTO updateTrainerProfile(UUID id, UpdateTrainerProfileRequestDTO requestDTO) {
        return trainerDAO.updateTrainerProfile(id, requestDTO);
    }
}
