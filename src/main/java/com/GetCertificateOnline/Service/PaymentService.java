package com.GetCertificateOnline.Service;

import java.util.List;

import com.GetCertificateOnline.Entities.Payment;
import com.GetCertificateOnline.Exception.PaymentNotFoundException;

public interface PaymentService {
	public Payment addPayment(Payment payment) throws PaymentNotFoundException;
	public Payment updatePayment(Payment payment) throws PaymentNotFoundException;
	public Payment getpaymentById(Integer paymentId) throws PaymentNotFoundException;
	public void deletepaymentById(Integer paymentId) throws PaymentNotFoundException;
	public List<Payment> getAllPayment();
}












