package com.alves.designpatterns.controller;

import com.alves.designpatterns.dto.UserDTO;
import com.alves.designpatterns.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    public List<UserDTO> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO create(@RequestBody UserDTO dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public UserDTO update(@PathVariable Long id, @RequestBody UserDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

