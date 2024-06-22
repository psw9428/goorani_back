package com.group.gorani.users.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Users {
    @Id
    private String id;
    private String username;
    private String summary;
    private Long point;
    private int numOfHostTicket;
}
