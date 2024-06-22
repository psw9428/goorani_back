package com.group.gorani.users.repository;

import com.group.gorani.users.domain.Users;
import com.group.gorani.users.dto.UsersGetResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query("SELECT u FROM Users u WHERE u.id = :id")
    Users findByIdName(@Param("id") String id);

}
