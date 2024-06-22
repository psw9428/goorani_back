package com.group.gorani.users.service;


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

    public List<UsersGetResponse> getAllUser() {
        List<UsersGetResponse> userlist = new ArrayList<>();
        var dbuserlist = usersRepository.findAll();
        dbuserlist.forEach((users -> {
            userlist.add(new UsersGetResponse(
                    users.getId(),
                    users.getUsername(),
                    users.getSummary(),
                    users.getPoint(),
                    users.getNumOfHostTicket()));
        }));
        return userlist;
    }

    public UsersGetResponse getUserById(String id) {
        var user = usersRepository.findByIdName(id);
        return new UsersGetResponse(
                user.getId(),
                user.getUsername(),
                user.getSummary(),
                user.getPoint(),
                user.getNumOfHostTicket()
        );
    }

}
