package com.group.gorani.betting.controller;

import com.group.gorani.betting.dto.BettingCreateRequest;
import com.group.gorani.betting.dto.BettingGetResponse;
import com.group.gorani.betting.service.BettingService;
import com.group.gorani.users.domain.Users;
import com.group.gorani.users.dto.UsersGetResponse;
import com.group.gorani.users.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BettingController {
    private final BettingService BettingService;

    @GetMapping("/betting")
    public ResponseEntity<List<BettingGetResponse>> getBetting() {
        return new ResponseEntity<>(BettingService.getBetting(), HttpStatus.OK);
    }

}
