package com.bus_online_reservation.user.dto;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {

    String fullName;

    String password;

    String phoneNumber;

    String address;

    String email;

    Boolean isActive;

    LocalDate birthDate;

    String role;

}
