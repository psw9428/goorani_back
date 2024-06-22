package com.group.gorani.betting.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BettingCreateRequest {
    private String _id;
    private String title;
    private String host_id;
    private String deadline;
    private String created_date;
    private String option;
    private int type;
}
