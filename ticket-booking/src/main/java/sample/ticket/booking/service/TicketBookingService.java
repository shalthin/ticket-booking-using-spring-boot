package sample.ticket.booking.service;

import java.util.List;

import sample.ticket.booking.model.UserDetails;

public interface TicketBookingService {
	
	public void enterUserDetails(List<UserDetails> userDetails);
	
	public void getAllUsers();
	
	public void getOneUser();
	
	public void updateUserDetails();
	
	public void deteteUser();
		
	

}
