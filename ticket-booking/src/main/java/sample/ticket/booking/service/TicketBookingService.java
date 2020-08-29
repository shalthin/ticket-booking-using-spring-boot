package sample.ticket.booking.service;

import java.util.List;

import sample.ticket.booking.model.UserAccount;

/**
 * TicketBookingService is the service class for the user to book the tickets
 * @author Shalini
 *
 */

public interface TicketBookingService {
	
	public void createUserAccount(UserAccount userAccount);
	
	public void getAllUsers();
	
	public void getUserById(int userId);
	
	public void updateUserDetails();
	
	public void deteteUser();
		
	

}
