package com.littleafricaproject.susuhelper.repository;


import com.littleafricaproject.susuhelper.model.SusuGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SusuGroupRepository extends JpaRepository<SusuGroup, Long> {
}
