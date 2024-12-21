package com.bus_online_reservation.reservation.service;

import com.bus_online_reservation.reservation.dto.ReservationResponse;
import com.bus_online_reservation.reservation.entity.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationAdminService {

    List<Reservation> getAll();

    Reservation getById(Long id);

    List<ReservationResponse> getByFromLocation(String fromLocation);

    List<ReservationResponse> getByToLocation(String toLocation);

    List<ReservationResponse> getByReservationDate(LocalDate reservationDate);

    List<ReservationResponse> getByTickedDate(LocalDate ticketDate);

}
