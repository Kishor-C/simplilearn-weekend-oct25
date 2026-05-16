package com.example.booking_ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
@CrossOrigin(origins = "*") 
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveBooking(@RequestBody Booking booking) {
		Booking createdBooking = bookingService.saveBooking(booking);
		return ResponseEntity.status(201).body(createdBooking);
	}
}
