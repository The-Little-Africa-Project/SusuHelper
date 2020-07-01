package com.littleafricaproject.susuhelper.repository;

import com.littleafricaproject.susuhelper.model.Susu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SusuRepository extends JpaRepository<Susu, Long> {
}
