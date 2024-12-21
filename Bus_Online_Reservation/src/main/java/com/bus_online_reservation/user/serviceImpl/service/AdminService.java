package com.bus_online_reservation.user.serviceImpl.service;

import com.bus_online_reservation.user.dto.UserRequest;
import com.bus_online_reservation.user.dto.UserResponse;
import com.bus_online_reservation.user.entity.User;

import java.time.LocalDate;
import java.util.List;


public interface AdminService {

    List<User> getAll();

    List<UserResponse> getByFullName(String fullName);

    List<UserResponse> getByBirthDate(LocalDate birthDate);

    List<UserResponse> getByAge(int age);

    List<UserResponse> getByYear(int year);

    List<UserResponse> getByAddress(String address);

    User getById(Long id);

    void delete(Long id);

    void update(Long id, UserRequest user);

    void create(UserRequest user);

}
