package com.epam.xstack.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
@Entity
@Table(name = "trainee")
public class Trainee extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trainee_id")
    private UUID id;

    @ManyToMany(mappedBy = "traineeList", fetch = FetchType.EAGER)
    private Collection<Trainer> trainers = new ArrayList<>();
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "trainee")
    private List<Training> trainings;
}
