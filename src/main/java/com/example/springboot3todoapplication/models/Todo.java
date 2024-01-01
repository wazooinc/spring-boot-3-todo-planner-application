package com.example.springboot3todoapplication.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String description;

    @Enumerated(EnumType.STRING)
    StatusType status;

    LocalDateTime createdAt;

    LocalDateTime updatedAt;

}
