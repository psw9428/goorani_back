package com.group.gorani.betting.service;

import com.group.gorani.betting.domain.Betting;
import com.group.gorani.betting.dto.BettingGetResponse;
import com.group.gorani.betting.repository.BettingRepository;
import com.group.gorani.users.dto.UsersGetResponse;
import com.group.gorani.users.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BettingService {
    private final com.group.gorani.betting.repository.BettingRepository BettingRepository;

    public List<BettingGetResponse> getBetting() {
        List<BettingGetResponse> bettinglist = new ArrayList<>();
        var dbbettinglist = BettingRepository.findAll();
        dbbettinglist.forEach((betting -> {
            bettinglist.add(new BettingGetResponse(
                    betting.get_id(),
                    betting.getTitle(),
                    betting.getHost_id(),
                    betting.getDeadline(),
                    betting.getCreated_date(),
                    betting.getOption(),
                    betting.getType()));
        }));
        return bettinglist;
    }

}
