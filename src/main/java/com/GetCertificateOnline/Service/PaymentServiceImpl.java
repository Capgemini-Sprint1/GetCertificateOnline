package com.GetCertificateOnline.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import com.GetCertificateOnline.Dao.PaymentDao;
import com.GetCertificateOnline.Entities.Payment;
import com.GetCertificateOnline.Exception.PaymentNotFoundException;


@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDao paymentDao;

	@Override
	public Payment addPayment(Payment payment) throws PaymentNotFoundException {
		paymentDao.save(payment);
		return payment;
	}
	 
	@Override
	public Payment updatePayment(Payment payment) throws PaymentNotFoundException {
		Payment newPayment = new Payment();
		newPayment.setCustomerName(payment.getCustomerName());
		newPayment.setPaymentMode(payment.getPaymentMode());
		newPayment.setPrice(payment.getPrice());
		paymentDao.save(newPayment);
		return newPayment;
	}
	
	@Override
	public Payment getpaymentById(Integer paymentId) throws PaymentNotFoundException {
		Payment pc;
		if(paymentDao.findById(paymentId).isEmpty()) {
			throw new PaymentNotFoundException();
		}
		else {
			pc=paymentDao.findById(paymentId).get();
		}
		return pc;
	}

	@Override
	public void deletepaymentById(Integer paymentId) throws PaymentNotFoundException {
		Payment pc=paymentDao.findById(paymentId).get();
		paymentDao.delete(pc);
	}

	@Override
	public List<Payment> getAllPayment() {
		return paymentDao.findAll();
	}
	
}	 











