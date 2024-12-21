package com.bus_online_reservation.reservation.mapper;

import com.bus_online_reservation.reservation.dto.ReservationRequest;
import com.bus_online_reservation.reservation.dto.ReservationResponse;
import com.bus_online_reservation.reservation.entity.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "Spring")
public interface ReservationMapper {

    ReservationResponse toDto(Reservation reservation);

    Reservation toEntity(ReservationRequest request);

    void update(ReservationRequest request, @MappingTarget Reservation reservation);

}
