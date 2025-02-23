package com.example.performans.repository;

import com.example.performans.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public  interface  UserRepository extends JpaRepository<User, Long> {

}
