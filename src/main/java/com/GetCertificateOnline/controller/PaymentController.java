package com.GetCertificateOnline.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GetCertificateOnline.Entities.Payment;
import com.GetCertificateOnline.Exception.PaymentAlreadyExistException;
import com.GetCertificateOnline.Exception.PaymentNotFoundException;
import com.GetCertificateOnline.Service.PaymentService;


@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	private final Logger mylogs = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/payment")
    public List<Payment> getAllCustomer() {

		return this.paymentService.getAllPayment();
    }

	@GetMapping("/payment/{paymentId}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable("customerId") Integer paymentId) throws PaymentNotFoundException {
		return new ResponseEntity<Payment>(paymentService.getpaymentById(paymentId), HttpStatus.OK);
	}

	@PostMapping("/payment")
	public ResponseEntity<String> addCustomer(@RequestBody Payment payment) throws PaymentNotFoundException {
			paymentService.addPayment(payment);
		return new ResponseEntity<String> ("Payment Successfully added",HttpStatus.OK); 

	}

	@PutMapping("/payment/{paymentId}")
	public ResponseEntity<String> updateCustomer(@RequestBody Payment payment) throws PaymentNotFoundException {
         this.paymentService.updatePayment(payment);
         return new ResponseEntity<>("Payment updated successfully",HttpStatus.OK);
	}

	@DeleteMapping("/payment/{paymentId}")
	public ResponseEntity<String>deleteCustomerById(@PathVariable("paymentId") Integer paymentId) throws PaymentNotFoundException {
     paymentService.deletepaymentById(paymentId);
     return new ResponseEntity<>("Payment Deleted Successfully",HttpStatus.OK);

	}
}

















