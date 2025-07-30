package com.alves.designpatterns.service;

import com.alves.designpatterns.dto.UserDTO;
import com.alves.designpatterns.factory.UserFactory;
import com.alves.designpatterns.model.User;
import com.alves.designpatterns.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<UserDTO> findAll() {
        return repository.findAll().stream()
                .map(UserFactory::toDTO)
                .collect(Collectors.toList());
    }

    public UserDTO findById(Long id) {
        return repository.findById(id)
                .map(UserFactory::toDTO)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public UserDTO create(UserDTO dto) {
        User entity = UserFactory.toEntity(dto);
        return UserFactory.toDTO(repository.save(entity));
    }

    public UserDTO update(Long id, UserDTO dto) {
        User user = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setName(dto.getName());
        user.setEmail(dto.getEmail());

        return UserFactory.toDTO(repository.save(user));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

