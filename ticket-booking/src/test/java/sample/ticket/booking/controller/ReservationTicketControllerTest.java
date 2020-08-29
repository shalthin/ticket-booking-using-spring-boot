package sample.ticket.booking.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;  

/**
 * ReservationTicketControllerTest class is used to testing the ReservationTicketController
 * 
 * @author Shalini
 *
 */

public class ReservationTicketControllerTest {
	
	/**
	 * testGetHomePage method is used to test the homePage.
	 */
	@Test
	public void testGetHomePage() {
		ReservationTicketController obj = new ReservationTicketController();
		assertEquals("Welcome to Ticket Reservation center", obj.getHomePage());
		
	}

}
