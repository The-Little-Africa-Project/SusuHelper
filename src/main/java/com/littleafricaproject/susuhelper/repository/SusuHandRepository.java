package com.littleafricaproject.susuhelper.repository;

import com.littleafricaproject.susuhelper.model.SusuHand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SusuHandRepository extends JpaRepository<SusuHand,Long> {
}
