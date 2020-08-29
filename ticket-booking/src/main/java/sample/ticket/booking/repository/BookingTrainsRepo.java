package sample.ticket.booking.repository;

import org.springframework.data.repository.CrudRepository;

import sample.ticket.booking.model.UserAccount;

/**
 * BookingTrainsRepo is the interface which extends CrudRepository which is used to get all the CRUD operations
 * 
 * @author Shalini
 *
 */

public interface BookingTrainsRepo extends CrudRepository<UserAccount, Integer> {

}
