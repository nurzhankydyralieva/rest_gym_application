package com.epam.xstack.controllers;

import com.epam.xstack.dao.training_dao.TrainingDAO;
import com.epam.xstack.models.dto.training_dto.request.TrainingRequestDTO;
import com.epam.xstack.models.dto.training_dto.response.TrainingResponseDTO;
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
    private final TrainingDAO trainingDAO;

//    @PostMapping("/save")
//    public ResponseEntity<TrainingResponseDTO> saveTrainee(@RequestBody TrainingRequestDTO requestDTO) {
//        return new ResponseEntity<>(trainingService.saveTraining(requestDTO), HttpStatus.CREATED);
//    }

    @PostMapping("/save")
    public ResponseEntity<TrainingRequestDTO> saveTrainee(@RequestBody TrainingRequestDTO requestDTO) {
        return new ResponseEntity<>(trainingDAO.saveTrainingTo(requestDTO), HttpStatus.CREATED);
    }
}
