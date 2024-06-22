package com.group.gorani.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsersGetResponse {
    private String id;
    private String username;
    private String summary;
    private Long point;
    private int num_of_host_ticket;
}
