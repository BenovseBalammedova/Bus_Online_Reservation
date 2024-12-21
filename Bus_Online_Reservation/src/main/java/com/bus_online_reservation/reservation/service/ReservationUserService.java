package com.bus_online_reservation.reservation.service;

import com.bus_online_reservation.reservation.dto.ReservationRequest;
import com.bus_online_reservation.reservation.entity.Reservation;

public interface ReservationUserService {

    Reservation create(ReservationRequest reservation);

    void delete(Long id);

    void update(Long id,ReservationRequest request);

}
