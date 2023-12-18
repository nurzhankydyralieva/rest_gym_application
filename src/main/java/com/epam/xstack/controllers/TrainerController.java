package com.epam.xstack.controllers;

import com.epam.xstack.dao.trainer_dao.TrainerDAO;
import com.epam.xstack.models.dto.trainee_dto.response.Ok_200_ResponseDTO;
import com.epam.xstack.models.dto.trainer_dto.request.ActivateDe_ActivateTrainerDTO;
import com.epam.xstack.models.dto.trainer_dto.request.GetTrainerProfileRequestDTO;
import com.epam.xstack.models.dto.trainer_dto.request.TrainerRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainer_dto.request.UpdateTrainerProfileRequestDTO;
import com.epam.xstack.models.dto.trainer_dto.response.GetTrainerProfileResponseDTO;
import com.epam.xstack.models.dto.trainer_dto.response.TrainerDTO;
import com.epam.xstack.models.dto.trainer_dto.response.TrainerRegistrationResponseDTO;
import com.epam.xstack.models.dto.trainer_dto.response.UpdateTrainerProfileResponseDTO;
import com.epam.xstack.service.trainer_service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

@RestController
@RequestMapping("/trainers")
@RequiredArgsConstructor
public class TrainerController {
    private final TrainerService trainerService;

    @PostMapping("/save")
    public ResponseEntity<TrainerRegistrationResponseDTO> saveTrainee(@RequestBody TrainerRegistrationRequestDTO requestDTO) {
        return new ResponseEntity<>(trainerService.saveTrainer(requestDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetTrainerProfileResponseDTO> selectTrainerProfile(@PathVariable("id") UUID id, @RequestBody GetTrainerProfileRequestDTO requestDTO) {
        return new ResponseEntity<>(trainerService.selectTrainerProfileByUserName(id, requestDTO), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<UpdateTrainerProfileResponseDTO> updateUser(@PathVariable("id") UUID id, @RequestBody UpdateTrainerProfileRequestDTO requestDTO) {
        return new ResponseEntity<>(trainerService.updateTrainerProfile(id, requestDTO), HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Ok_200_ResponseDTO> updateActivateDe_ActivateTrainer(@PathVariable("id") UUID id, @RequestBody ActivateDe_ActivateTrainerDTO dto) {
        return new ResponseEntity<>(trainerService.activateDe_ActivateTrainer(id, dto), HttpStatus.OK);
    }

    private final TrainerDAO trainerDAO;

    @GetMapping("/all")
    public ResponseEntity<Collection<TrainerDTO>> select() {
        return new ResponseEntity<>(trainerDAO.selectNotAssignedOnTraineeActiveTrainers(), HttpStatus.OK);
    }
}
