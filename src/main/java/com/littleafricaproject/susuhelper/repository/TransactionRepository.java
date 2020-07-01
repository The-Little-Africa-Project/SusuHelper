package com.littleafricaproject.susuhelper.repository;

import com.littleafricaproject.susuhelper.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
