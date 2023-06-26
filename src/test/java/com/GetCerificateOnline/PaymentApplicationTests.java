// //package com.GetCerificateOnline;

// //import static org.junit.Assert.assertEquals;
// //import static org.junit.Assert.assertNotNull;
// import static org.junit.Assert.assertNull;
// import static org.mockito.ArgumentMatchers.any;
// import static org.mockito.Mockito.doNothing;
// import static org.mockito.Mockito.mock;
// import static org.mockito.Mockito.when;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Optional;

// import org.junit.Before;
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;
// import org.mockito.junit.MockitoJUnitRunner;

// import com.GetCertificateOnline.Dao.PaymentDao;
// import com.GetCertificateOnline.Entities.Payment;
// import com.GetCertificateOnline.Exception.PaymentNotFoundException;
// import com.GetCertificateOnline.Service.PaymentServiceImpl;

// @RunWith(MockitoJUnitRunner.class)
// public class PaymentApplicationTests {

// 	@Mock
// 	private PaymentDao paymentDao;

// 	@InjectMocks
// 	private PaymentServiceImpl paymentService;

// 	@Before
// 	public void setup() {
// 		MockitoAnnotations.initMocks(this);
// 	}

// 	@Test
// 	public void testAddPayment() throws PaymentNotFoundException {
// 		Payment payment = new Payment();
// 		payment.setCustomerName("John Doe");
// 		payment.setPaymentMode("Credit Card");
// 		payment.setPrice((float) 100.0);

// 		when(paymentDao.save(any(Payment.class))).thenReturn(payment);

// 		Payment savedPayment = paymentService.addPayment(payment);

// 		assertNotNull(savedPayment);
// 		assertEquals("John Doe", savedPayment.getCustomerName());
// 		assertEquals("Credit Card", savedPayment.getPaymentMode());
// 		assertEquals(100.0, savedPayment.getPrice(), 0.001);
// 	}

// 	@Test
// 	public void testUpdatePayment() throws PaymentNotFoundException {
// 		Payment payment = new Payment();
// 		payment.setCustomerName("John Doe");
// 		payment.setPaymentMode("Credit Card");
// 		payment.setPrice((float) 100.0);

// 		when(paymentDao.save(any(Payment.class))).thenReturn(payment);

// 		Payment updatedPayment = paymentService.updatePayment(payment);

// 		assertNotNull(updatedPayment);
// 		assertEquals("John Doe", updatedPayment.getCustomerName());
// 		assertEquals("Credit Card", updatedPayment.getPaymentMode());
// 		assertEquals(100.0, updatedPayment.getPrice(), 0.001);
// 	}

// //	@Test(expected = PaymentNotFoundException.class)
// //	public void testUpdatePayment_ThrowsPaymentNotFoundException() throws PaymentNotFoundException {
// //		Payment payment = new Payment();
// //		payment.setPaymentId(1);
// //
// //		when(paymentDao.findById(1)).thenReturn(Optional.empty());
// //
// //		paymentService.updatePayment(payment);
// //	}

// //	@Test
// //	public void testGetPaymentById() throws PaymentNotFoundException {
// //		Payment payment = new Payment();
// //		payment.setPaymentId(1);
// //		payment.setCustomerName("John Doe");
// //		payment.setPaymentMode("Credit Card");
// //		payment.setPrice((float) 100.0);
// //
// //		when(paymentDao.findById(1)).thenReturn(Optional.of(payment));
// //
// //		Payment retrievedPayment = paymentService.getpaymentById(1);
// //
// //		assertNotNull(retrievedPayment);
// //		assertEquals("John Doe", retrievedPayment.getCustomerName());
// //		assertEquals("Credit Card", retrievedPayment.getPaymentMode());
// //		assertEquals(100.0, retrievedPayment.getPrice(), 0.001);
// //	}

// 	@Test(expected = PaymentNotFoundException.class)
// 	public void testGetPaymentById_ThrowsPaymentNotFoundException() throws PaymentNotFoundException {
// 		when(paymentDao.findById(1)).thenReturn(Optional.empty());

// 		paymentService.getpaymentById(1);
// 	}

// 	@Test
// 	public void testDeletePaymentById() throws PaymentNotFoundException {
// 		Payment payment = new Payment();
// 		payment.setPaymentId(1);
// 		payment.setCustomerName("John Doe");
// 		payment.setPaymentMode("Credit Card");
// 		payment.setPrice((float) 100.0);

// 		when(paymentDao.findById(1)).thenReturn(Optional.of(payment));
// 		doNothing().when(paymentDao).delete(payment);

// 		paymentService.deletepaymentById(1);
// 	}

// //	@Test(expected = PaymentNotFoundException.class)
// //	public void testDeletePaymentById_ThrowsPaymentNotFoundException() throws PaymentNotFoundException {
// //		when(paymentDao.findById(1)).thenReturn(Optional.empty());
// //
// //		paymentService.deletepaymentById(1);
// //	}

// 	@Test
// 	public void testGetAllPayment() {
// 		List<Payment> paymentList = new ArrayList<>();
// 		Payment payment1 = new Payment();
// 		payment1.setPaymentId(1);
// 		payment1.setCustomerName("John Doe");
// 		payment1.setPaymentMode("Credit Card");
// 		payment1.setPrice((float) 100.0);
// 		paymentList.add(payment1);

// 		Payment payment2 = new Payment();
// 		payment2.setPaymentId(2);
// 		payment2.setCustomerName("Jane Smith");
// 		payment2.setPaymentMode("PayPal");
// 		payment2.setPrice((float) 50.0);
// 		paymentList.add(payment2);

// 		when(paymentDao.findAll()).thenReturn(paymentList);

// 		List<Payment> retrievedPaymentList = paymentService.getAllPayment();

// 		assertNotNull(retrievedPaymentList);
// 		assertEquals(2, retrievedPaymentList.size());
// 		assertEquals("John Doe", retrievedPaymentList.get(0).getCustomerName());
// 		assertEquals("Credit Card", retrievedPaymentList.get(0).getPaymentMode());
// 		assertEquals(100.0, retrievedPaymentList.get(0).getPrice(), 0.001);
// 		assertEquals("Jane Smith", retrievedPaymentList.get(1).getCustomerName());
// 		assertEquals("PayPal", retrievedPaymentList.get(1).getPaymentMode());
// 		assertEquals(50.0, retrievedPaymentList.get(1).getPrice(), 0.001);
// 	}
// }
