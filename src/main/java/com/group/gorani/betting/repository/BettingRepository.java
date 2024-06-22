package com.group.gorani.betting.repository;

import com.group.gorani.betting.domain.Betting;
import com.group.gorani.users.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BettingRepository extends JpaRepository<Betting, Long> {
    @Query("SELECT u FROM Betting u WHERE u.host_id = :host_id")
    Betting findByHostId(@Param("host_id") String host_id);
}
