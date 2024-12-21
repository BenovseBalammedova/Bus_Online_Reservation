package com.bus_online_reservation.user.controller;


import com.bus_online_reservation.user.dto.UserRequest;
import com.bus_online_reservation.user.dto.UserResponse;
import com.bus_online_reservation.user.entity.User;
import com.bus_online_reservation.user.serviceImpl.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.time.LocalDate;


@RestController
@RequestMapping("/api/admin/")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService service;

   @GetMapping()
   private List<User> getAll(){
       return service.getAll();
   }

   @GetMapping("full_name/{full_name}")
  private List<UserResponse> getByFullName(@PathVariable("fullName") String fullName){
       return service.getByFullName(fullName);
  }

    @GetMapping("birthdate/{birthdate}")
   private List<UserResponse> getByBirthDate(@PathVariable("birthDate") LocalDate birthDate){
       return service.getByBirthDate(birthDate);
   }


    @GetMapping("age/{age}")
   private List<UserResponse> getByAge(@PathVariable int age){
       return service.getByAge(age);
   }

    @GetMapping("year/{year}")
    private List<UserResponse> getByYear(@PathVariable int year){
       return service.getByYear(year);
    }

    @GetMapping("address/{address}")
    private List<UserResponse> getByAddress(@PathVariable String address){
       return service.getByAddress(address);
    }

    @GetMapping("{id}")
   private User getById(@PathVariable Long id){
       return service.getById(id);
    }

    @DeleteMapping("{id}")
   private void delete(@PathVariable Long id){
       service.delete(id);
    }

    @PutMapping("{id}")
   private void update(@PathVariable Long id,@RequestBody UserRequest user){
       service.update(id, user);
   }

   @PostMapping()
    void create(@RequestBody UserRequest user){
       service.create(user);
    }
}
