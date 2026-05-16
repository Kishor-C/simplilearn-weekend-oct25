package com.example.booking_ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

	@Autowired
	private BookingRepo bookingRepo;
	
	public Booking saveBooking(Booking booking) {
		// calculate the fare based on regular, premium, Luxury
		double rate = 0;
		double baseFare = 0;
		if(booking.getType().equalsIgnoreCase("regular")) {
			baseFare = 100;
			rate = 10;
		}
		if(booking.getType().equalsIgnoreCase("premium")) {
			baseFare = 120;
			rate = 12;
		}if(booking.getType().equalsIgnoreCase("luxury")) {
			baseFare = 150;
			rate = 15;
		}	
		double totalFare = baseFare + (booking.getDistance() * rate);
		booking.setRate(rate);
		booking.setTotal(totalFare);
		return bookingRepo.save(booking);
	}
}
