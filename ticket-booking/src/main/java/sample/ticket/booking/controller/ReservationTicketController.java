package sample.ticket.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sample.ticket.booking.model.UserDetails;
import sample.ticket.booking.service.TicketBookingService;

@RestController
public class ReservationTicketController {
	
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@RequestMapping("/home")
	public String getHomePage() {
		return "Welcome to Ticket Reservation center";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/enterUserDetails")
	public void enterUserDetails(@RequestBody List<UserDetails> userDetails) {
		ticketBookingService.enterUserDetails(userDetails);
	}

}
