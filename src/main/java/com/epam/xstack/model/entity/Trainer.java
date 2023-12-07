package com.epam.xstack.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
@Entity
@Table(name = "trainer")
public class Trainer extends User{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "trainer_id")
    private UUID id;
    @JsonIgnore
    @ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    private List<Trainee> traineeList = new ArrayList<>();
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "trainer")
    private List<Training> trainings;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "specialization_id")
    private TrainingType specialization;


}
