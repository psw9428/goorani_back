package com.group.gorani.betting.dto;

import com.group.gorani.users.dto.UsersGetResponse;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BettingGetResponse {
    private Long id;
    private String title;
    private String host_id;
    private String deadline;
    private String created_date;
    private String option;
    private int type;
}
