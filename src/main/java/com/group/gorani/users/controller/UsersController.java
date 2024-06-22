package com.group.gorani.users.controller;

import com.group.gorani.users.dto.AddUserRequest;
import com.group.gorani.users.dto.EditUserRequest;
import com.group.gorani.users.dto.MessageResponse;
import com.group.gorani.users.dto.UsersGetResponse;
import com.group.gorani.users.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UsersController {
    private final UsersService usersService;

    @GetMapping("/users")
    public ResponseEntity<List<UsersGetResponse>> getUser(@RequestParam(required = false) String username) {
        ResponseEntity<List<UsersGetResponse>> result;
        if (username.isEmpty()) {
            result = new ResponseEntity<>(usersService.getAllUser(), HttpStatus.OK);
        } else {
            result = new ResponseEntity<>(usersService.getUserByName(username), HttpStatus.OK);
        }
        return result;
    }
    @GetMapping("/users/{id}")
    public ResponseEntity<List<UsersGetResponse>> getUserById(@PathVariable String id) {
        return new ResponseEntity<>(usersService.getUserById(id), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<MessageResponse> addUser(@RequestBody AddUserRequest request) {
        usersService.addUser(request);
        return new ResponseEntity<>(new MessageResponse("success!"), HttpStatus.OK);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<MessageResponse> editUser(@PathVariable String id ,@RequestBody EditUserRequest request) {
        usersService.editUser(id, request);
        return new ResponseEntity<>(new MessageResponse("success!"), HttpStatus.OK);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<MessageResponse> deleteUser(@PathVariable String id) {
        usersService.deleteUser(id);
        return new ResponseEntity<>(new MessageResponse("success!"), HttpStatus.OK);
    }
}
