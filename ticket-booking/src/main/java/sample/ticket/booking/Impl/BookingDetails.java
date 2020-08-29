package sample.ticket.booking.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.ticket.booking.model.UserAccount;
import sample.ticket.booking.repository.BookingTrainsRepo;
import sample.ticket.booking.service.TicketBookingService;

/**
 * BookingDetails class is used to implement the booking methods of the ticket
 * 
 * @author Shalini
 *
 */

@Service
public class BookingDetails implements TicketBookingService {
	
	@Autowired
	private BookingTrainsRepo bookingTrainsRepo;

	@Override
	public void createUserAccount(UserAccount userAccount) {
		bookingTrainsRepo.save(userAccount);
		
	}

	@Override
	public void getAllUsers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getUserById(int userId) {
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
