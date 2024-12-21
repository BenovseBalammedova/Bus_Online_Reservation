package com.bus_online_reservation.user.controller;

import com.bus_online_reservation.user.dto.RegisterRequest;
import com.bus_online_reservation.user.dto.UserRequest;
import com.bus_online_reservation.user.dto.UserResponse;
import com.bus_online_reservation.user.serviceImpl.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users/")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @DeleteMapping("{id}")
    private void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("{id}")
    private void update(@PathVariable Long id, @RequestBody UserRequest user) {
        service.update(id, user);
    }

    @PostMapping()
    private void create(@RequestBody UserRequest user) {
        service.create(user);
    }

    @GetMapping("{id}")
    private UserResponse getById(@PathVariable Long id) {
       return service.getById(id);
    }
    @PostMapping("register")
    void register(@RequestBody RegisterRequest request){
        service.register(request);
    }

}
