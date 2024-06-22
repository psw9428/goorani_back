package com.group.gorani.betting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Betting {
    @Id
    private String _id;
    private String title;
    private String host_id;
    private String deadline;
    private String created_date;
    private String option;
    private int type;
}
