package com.bus_online_reservation.user.mapper;

import com.bus_online_reservation.security.MyUserDetails;
import com.bus_online_reservation.user.dto.RegisterRequest;
import com.bus_online_reservation.user.dto.UserRequest;
import com.bus_online_reservation.user.dto.UserResponse;
import com.bus_online_reservation.user.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-21T09:21:11-0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse.UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.fullName( user.getFullName() );
        userResponse.phoneNumber( user.getPhoneNumber() );
        userResponse.address( user.getAddress() );
        userResponse.email( user.getEmail() );
        userResponse.isActive( user.getIsActive() );
        userResponse.birthDate( user.getBirthDate() );
        userResponse.role( user.getRole() );

        return userResponse.build();
    }

    @Override
    public User toEntity(UserRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.fullName( userRequest.getFullName() );
        user.password( userRequest.getPassword() );
        user.phoneNumber( userRequest.getPhoneNumber() );
        user.isActive( userRequest.getIsActive() );
        user.address( userRequest.getAddress() );
        user.email( userRequest.getEmail() );
        user.birthDate( userRequest.getBirthDate() );
        user.role( userRequest.getRole() );

        return user.build();
    }

    @Override
    public MyUserDetails toMyUserDetails(User user) {
        if ( user == null ) {
            return null;
        }

        String email = null;
        String password = null;
        Boolean isActive = null;

        email = user.getEmail();
        password = user.getPassword();
        isActive = user.getIsActive();

        MyUserDetails myUserDetails = new MyUserDetails( email, password, isActive );

        return myUserDetails;
    }

    @Override
    public User toUser(RegisterRequest request) {
        if ( request == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.fullName( request.getFullName() );
        user.password( request.getPassword() );
        user.phoneNumber( request.getPhoneNumber() );
        user.isActive( request.getIsActive() );
        user.address( request.getAddress() );
        user.email( request.getEmail() );
        user.birthDate( request.getBirthDate() );
        user.role( request.getRole() );

        return user.build();
    }

    @Override
    public void updateFromDto(UserRequest userRequest, User userUpdate) {
        if ( userRequest == null ) {
            return;
        }

        userUpdate.setFullName( userRequest.getFullName() );
        userUpdate.setPassword( userRequest.getPassword() );
        userUpdate.setPhoneNumber( userRequest.getPhoneNumber() );
        userUpdate.setIsActive( userRequest.getIsActive() );
        userUpdate.setAddress( userRequest.getAddress() );
        userUpdate.setEmail( userRequest.getEmail() );
        userUpdate.setBirthDate( userRequest.getBirthDate() );
        userUpdate.setRole( userRequest.getRole() );
    }
}
