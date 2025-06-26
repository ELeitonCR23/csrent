package com.csrent.service;

import com.csrent.dto.ReservationDTO;
import com.csrent.model.Reservation;
import com.csrent.model.Space;
import com.csrent.model.User;
import com.csrent.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {


    private ReservationRepository reservationRepository;
    private UserService userService;
    private SpaceService spaceService;

    public ReservationService(ReservationRepository reservationRepository, SpaceService spaceService, UserService userService) {
        this.reservationRepository = reservationRepository;
        this.spaceService = spaceService;
        this.userService = userService;
    }

    public List<Reservation> getAll()
    {
        return reservationRepository.findAll();

    }//getAll

    public Reservation add(ReservationDTO reservationDto)
    {
        User user  = userService.getUserByEmail(reservationDto.getUserEmail());
        Space space = spaceService.getSpace(reservationDto.getSpaceId());
        Reservation reservation = new Reservation();
        reservation.setUser(user);
        reservation.setSpace(space);
        reservation.setDateReservation(reservationDto.getDateReservation());
        reservation.setStatus(reservationDto.getStatus());

        return reservationRepository.save(reservation);

    }//reservation


}//end of class
