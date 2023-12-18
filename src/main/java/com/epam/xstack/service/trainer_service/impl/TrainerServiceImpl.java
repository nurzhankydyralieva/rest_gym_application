package com.epam.xstack.service.trainer_service.impl;

import com.epam.xstack.dao.trainer_dao.TrainerDAO;
import com.epam.xstack.models.dto.trainee_dto.response.Ok_200_ResponseDTO;
import com.epam.xstack.models.dto.trainer_dto.request.ActivateDe_ActivateTrainerDTO;
import com.epam.xstack.models.dto.trainer_dto.request.GetTrainerProfileRequestDTO;
import com.epam.xstack.models.dto.trainer_dto.request.TrainerRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainer_dto.request.UpdateTrainerProfileRequestDTO;
import com.epam.xstack.models.dto.trainer_dto.response.GetTrainerProfileResponseDTO;
import com.epam.xstack.models.dto.trainer_dto.response.TrainerRegistrationResponseDTO;
import com.epam.xstack.models.dto.trainer_dto.response.UpdateTrainerProfileResponseDTO;
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

    @Override
    public Ok_200_ResponseDTO activateDe_ActivateTrainer(UUID id, ActivateDe_ActivateTrainerDTO dto) {
        return trainerDAO.activateDe_ActivateTrainer(id, dto);
    }
}
