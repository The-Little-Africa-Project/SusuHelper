package com.littleafricaproject.susuhelper.repository;


import com.littleafricaproject.susuhelper.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
