package sample.ticket.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sample.ticket.booking.model.UserAccount;
import sample.ticket.booking.service.TicketBookingService;

/**
 * ReservationTicketController class is used to booking tickets for the users.
 * 
 * @author Shalini
 *
 */

@RestController
public class ReservationTicketController {
	
	@Autowired
	private TicketBookingService ticketBookingService;
	
	public static final String WELCOME_MESSAGE = "Welcome to Ticket Reservation center";
	public static final String USER_CREATION = "User created Successfully";
	
	
	/**
	 * getHomePage method is used to get the welcome message when user enters home page
	 * @return string
	 */
	@RequestMapping("/home")
	public String getHomePage() {
		return WELCOME_MESSAGE;
	}
	
	/**
	 * createAccount method is used to create the user detail account
	 * 
	 * @param userAccount
	 * @return string
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/enter")
	public String createAccount(@RequestBody UserAccount userAccount) {
		ticketBookingService.createUserAccount(userAccount);
		return USER_CREATION;
	}

}
