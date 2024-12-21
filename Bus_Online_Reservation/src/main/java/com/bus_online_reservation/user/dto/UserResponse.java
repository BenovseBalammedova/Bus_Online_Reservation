package com.bus_online_reservation.user.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {

    String fullName;

    String phoneNumber;

    String address;

    String email;

    Boolean isActive;

    LocalDate birthDate;

    String role;

}
