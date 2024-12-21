package com.bus_online_reservation.user.serviceImpl.service;

import com.bus_online_reservation.user.dto.RegisterRequest;
import com.bus_online_reservation.user.dto.UserRequest;
import com.bus_online_reservation.user.dto.UserResponse;
import com.bus_online_reservation.user.entity.User;


public interface UserService {

    void delete(Long id);

    void update(Long id, UserRequest user);

    void create(UserRequest user);

    UserResponse getById(Long id);

    void register(RegisterRequest request);

}
