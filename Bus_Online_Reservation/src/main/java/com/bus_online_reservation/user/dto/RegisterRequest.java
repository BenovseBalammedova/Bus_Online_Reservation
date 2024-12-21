package com.bus_online_reservation.user.dto;

import jakarta.validation.constraints.Email;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegisterRequest {
    @Email
    String email;

    String password;

    String fullName;

    String phoneNumber;

    String address;

    Boolean isActive;

    LocalDate birthDate;

    String role;

}