package com.bus_online_reservation.ticket.service.serviceImpl;

import com.bus_online_reservation.ticket.dto.TicketRequest;
import com.bus_online_reservation.ticket.dto.TicketResponse;
import com.bus_online_reservation.ticket.entity.Ticket;
import com.bus_online_reservation.ticket.mapper.TicketMapper;
import com.bus_online_reservation.ticket.repository.TicketRepository;
import com.bus_online_reservation.ticket.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final TicketRepository repository;

    private final TicketMapper mapper;

    @Override
    public List<TicketResponse> getUserTicketByUserId(String userId) {

        List<Ticket> tickets = repository.findTicketByUserId(userId);

        return tickets.stream().map(mapper::toDto).toList();
    }

    @Override
    public List<TicketResponse> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public List<TicketResponse> getByFromLocation(String fromLocation) {

        List<Ticket> ticketByFromLocation = repository.findTicketByFromLocation(fromLocation);

        return ticketByFromLocation.stream().map(mapper::toDto).toList();
    }

    @Override
    public List<TicketResponse> getByToLocation(String toLocation) {

        List<Ticket> ticketByToLocation = repository.findTicketByToLocation(toLocation);

        return ticketByToLocation.stream().map(mapper::toDto).toList();
    }

    @Override
    public List<TicketResponse> getByTicketDate(LocalDate ticketDate) {

        List<Ticket> ticketByTicketDate = repository.findTicketByTicketDate(ticketDate);

        return ticketByTicketDate.stream().map(mapper::toDto).toList();
    }

    @Override
    public void createTicket(TicketRequest dto) {
        repository.save(mapper.toEntity(dto));
    }

    @Override
    public void deleteTicketById(Long id) {
        repository.deleteTicketByIdAndDate(id, LocalDate.now());
    }
}