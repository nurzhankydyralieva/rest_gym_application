package com.epam.xstack.controllers;

import com.epam.xstack.models.dto.training_dto.request.AddTrainingRequestDTO;
import com.epam.xstack.models.dto.training_dto.response.AddTrainingResponseDTO;
import com.epam.xstack.service.training_service.TrainingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainings")
@RequiredArgsConstructor

public class TrainingController {
    private final TrainingService trainingService;

    @PostMapping("/save")
    public ResponseEntity<AddTrainingResponseDTO> saveTrainee(@RequestBody AddTrainingRequestDTO requestDTO) {
        return new ResponseEntity<>(trainingService.saveTraining(requestDTO), HttpStatus.CREATED);
    }

}
