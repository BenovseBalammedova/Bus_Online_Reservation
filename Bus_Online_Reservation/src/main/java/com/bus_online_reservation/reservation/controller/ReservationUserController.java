package com.bus_online_reservation.reservation.controller;

import com.bus_online_reservation.reservation.dto.ReservationRequest;
import com.bus_online_reservation.reservation.entity.Reservation;
import com.bus_online_reservation.reservation.service.ReservationUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservations/")
@RequiredArgsConstructor
public class ReservationUserController {
    private final ReservationUserService service;

    @PostMapping()
    private Reservation create(@RequestBody ReservationRequest reservation) {
        return service.create(reservation);
    }

    @DeleteMapping("{id}")
    private void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("{id}")
    private void update(@PathVariable Long id, @RequestBody ReservationRequest request) {
        service.update(id, request);
    }
}
