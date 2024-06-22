package com.group.gorani.users.service;


import com.group.gorani.users.domain.Users;
import com.group.gorani.users.dto.AddUserRequest;
import com.group.gorani.users.dto.AddUserResponse;
import com.group.gorani.users.dto.UsersGetResponse;
import com.group.gorani.users.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;

    private UsersGetResponse usersToUsersGetResponse(Users u) {
        return new UsersGetResponse(
                u.getId(),
                u.getUsername(),
                u.getSummary(),
                u.getPoint(),
                u.getNumOfHostTicket()
        );
    }

    private Users AddUserRequestToUsers(AddUserRequest request) {
        return new Users(
                request.getId(),
                request.getUsername(),
                request.getSummary(),
                request.getPoint(),
                request.getNumOfHostTicket()
        );
    }

    public List<UsersGetResponse> getAllUser() {
        List<UsersGetResponse> userlist = new ArrayList<>();
        var dbuserlist = usersRepository.findAll();
        dbuserlist.forEach((users -> {
            userlist.add(usersToUsersGetResponse(users));
        }));
        return userlist;
    }
    public List<UsersGetResponse> getUserById(String id) {
        var user = usersRepository.findByIdName(id);
        List<UsersGetResponse> userlist = new ArrayList<>();
        userlist.add(usersToUsersGetResponse(user));
        return userlist;
    }
    public List<UsersGetResponse> getUserByName(String username) {
        var user = usersRepository.findByUsername(username);
        List<UsersGetResponse> userlist = new ArrayList<>();
        userlist.add(usersToUsersGetResponse(user));
        return userlist;
    }

    public void addUser(AddUserRequest request) {
        usersRepository.save(AddUserRequestToUsers(request));
    }

}
