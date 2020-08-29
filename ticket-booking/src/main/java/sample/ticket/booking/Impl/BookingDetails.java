package sample.ticket.booking.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.ticket.booking.model.UserDetails;
import sample.ticket.booking.repository.BookingTrainsRepo;
import sample.ticket.booking.service.TicketBookingService;

@Service
public class BookingDetails implements TicketBookingService {
	
	@Autowired
	private BookingTrainsRepo bookingTrainsRepo;

	@Override
	public void enterUserDetails(List<UserDetails> userDetails) {
		bookingTrainsRepo.saveAll(userDetails);
		
	}

	@Override
	public void getAllUsers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getOneUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deteteUser() {
		// TODO Auto-generated method stub
		
	}

}
