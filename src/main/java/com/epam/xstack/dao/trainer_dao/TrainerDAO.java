package com.epam.xstack.dao.trainer_dao;

import com.epam.xstack.models.dto.trainer.request.TrainerRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainer.response.TrainerRegistrationResponseDTO;

public interface TrainerDAO {
    TrainerRegistrationResponseDTO saveTrainer(TrainerRegistrationRequestDTO requestDTO);
}
