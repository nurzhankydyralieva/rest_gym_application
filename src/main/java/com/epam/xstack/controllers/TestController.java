package com.epam.xstack.controllers;

import com.epam.xstack.dao.TestDAO;
import com.epam.xstack.models.entity.Trainee;
import com.epam.xstack.models.entity.TrainingType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class TestController {
    private final TestDAO traineeDAO;
    @GetMapping("/trainee")
    public ResponseEntity<List<Trainee>> show(){
        return new ResponseEntity<>(traineeDAO.getAllTrainee(), HttpStatus.OK);
    }

}
