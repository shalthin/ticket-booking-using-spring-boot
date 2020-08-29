package sample.ticket.booking.repository;

import org.springframework.data.repository.CrudRepository;

import sample.ticket.booking.model.UserDetails;

public interface BookingTrainsRepo extends CrudRepository<UserDetails, String> {

}
