package com.bus_online_reservation.ticket.service;

import com.bus_online_reservation.ticket.dto.TicketRequest;
import com.bus_online_reservation.ticket.dto.TicketResponse;
import com.bus_online_reservation.ticket.entity.Ticket;

import java.time.LocalDate;
import java.util.List;

public interface TicketService {

    List<TicketResponse> getUserTicketByUserId(String userId);

    List<TicketResponse> getAll();

    List<TicketResponse> getByFromLocation(String fromLocation);

    List<TicketResponse> getByToLocation(String toLocation);

    List<TicketResponse> getByTicketDate(LocalDate ticketDate);

    void createTicket(TicketRequest dto);

    void deleteTicketById(Long id);
}
