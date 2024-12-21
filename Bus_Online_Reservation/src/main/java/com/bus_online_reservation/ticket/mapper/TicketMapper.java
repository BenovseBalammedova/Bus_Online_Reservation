package com.bus_online_reservation.ticket.mapper;

import com.bus_online_reservation.ticket.dto.TicketRequest;
import com.bus_online_reservation.ticket.dto.TicketResponse;
import com.bus_online_reservation.ticket.entity.Ticket;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "Spring")
public interface TicketMapper {

    TicketResponse toDto(Ticket ticket);

    Ticket toEntity(TicketRequest ticketRequest);

    void update(TicketRequest ticketRequest, @MappingTarget Ticket ticket);

}
