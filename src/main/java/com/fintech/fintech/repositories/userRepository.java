package com.fintech.fintech.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fintech.fintech.models.user;

public interface userRepository extends JpaRepository<user, Long> {

}