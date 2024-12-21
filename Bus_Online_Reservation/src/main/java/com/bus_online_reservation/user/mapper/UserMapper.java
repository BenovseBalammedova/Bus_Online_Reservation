package com.bus_online_reservation.user.mapper;

import com.bus_online_reservation.security.MyUserDetails;
import com.bus_online_reservation.user.dto.RegisterRequest;
import com.bus_online_reservation.user.dto.UserRequest;
import com.bus_online_reservation.user.dto.UserResponse;
import com.bus_online_reservation.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "Spring")
public interface UserMapper {

    UserResponse toDto(User user);

    User toEntity(UserRequest userRequest);

    MyUserDetails toMyUserDetails(User user);

    User toUser(RegisterRequest request);

    void updateFromDto(UserRequest userRequest, @MappingTarget User userUpdate);
}
