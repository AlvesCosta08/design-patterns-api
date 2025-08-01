package com.alves.designpatterns.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users") // <- alterado aqui
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}
