package com.GetCertificateOnline.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GetCertificateOnline.Entities.Payment;

@Repository
public interface PaymentDao extends JpaRepository<Payment, Integer> {
	 

	}














