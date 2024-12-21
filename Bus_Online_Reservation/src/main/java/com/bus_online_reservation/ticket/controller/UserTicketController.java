package com.bus_online_reservation.ticket.controller;

import com.bus_online_reservation.ticket.dto.TicketRequest;
import com.bus_online_reservation.ticket.dto.TicketResponse;
import com.bus_online_reservation.ticket.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ticket/user")
public class UserTicketController {
    private final TicketService service;

    @GetMapping("/{user-id}")
    public List<TicketResponse> getUserTicketByUserId(@PathVariable("user-id") String userId){
        return service.getUserTicketByUserId(userId);
    }

    @PostMapping()
    public void createTicket(@RequestBody TicketRequest dto){
        service.createTicket(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteTicketById(@PathVariable Long id){
        service.deleteTicketById(id);
    }

}

