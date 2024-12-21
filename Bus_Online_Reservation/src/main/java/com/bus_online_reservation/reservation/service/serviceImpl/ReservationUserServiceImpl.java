package com.bus_online_reservation.reservation.service.serviceImpl;

import com.bus_online_reservation.reservation.dto.ReservationRequest;
import com.bus_online_reservation.reservation.entity.Reservation;
import com.bus_online_reservation.reservation.mapper.ReservationMapper;
import com.bus_online_reservation.reservation.repository.ReservationRepository;
import com.bus_online_reservation.reservation.service.ReservationUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationUserServiceImpl implements ReservationUserService {
    private final ReservationMapper mapper;
    private final ReservationRepository repository;

    @Override
    public Reservation create(ReservationRequest reservation) {
        Reservation reservations = mapper.toEntity(reservation);
        return repository.save(reservations);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }

    @Override
    public void update(Long id, ReservationRequest request) {
        Reservation reservations = repository.findById(id).orElseThrow();
        mapper.update(request, reservations);
        repository.save(reservations);
    }
}
