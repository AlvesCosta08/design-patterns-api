package com.alves.designpatterns.factory;

import com.alves.designpatterns.dto.UserDTO;
import com.alves.designpatterns.model.User;

public class UserFactory {

    public static UserDTO toDTO(User user) {
        return UserDTO.builder()
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }

    public static User toEntity(UserDTO dto) {
        return User.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .build();
    }
}
