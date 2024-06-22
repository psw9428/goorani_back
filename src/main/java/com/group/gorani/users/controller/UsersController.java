package com.group.gorani.users.controller;

import com.group.gorani.users.domain.Users;
import com.group.gorani.users.dto.UsersGetResponse;
import com.group.gorani.users.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UsersController {
    private final UsersService usersService;

    @GetMapping("/users")
    public ResponseEntity<List<UsersGetResponse>> getAllUser() {
        return new ResponseEntity<>(usersService.getAllUser(), HttpStatus.OK);
    }
    @GetMapping("/users/{id}")
    public ResponseEntity<UsersGetResponse> getUserById(@PathVariable String id) {
        return new ResponseEntity<>(usersService.getUserById(id), HttpStatus.OK);
    }
}
