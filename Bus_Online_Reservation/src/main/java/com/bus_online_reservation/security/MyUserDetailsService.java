package com.bus_online_reservation.security;

import com.bus_online_reservation.exception.UserNotFoundException;
import com.bus_online_reservation.user.entity.User;
import com.bus_online_reservation.user.mapper.UserMapper;
import com.bus_online_reservation.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {
    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = (repository.findUserByEmail(username))
                .orElseThrow(() -> new UserNotFoundException(username));
        return mapper.toMyUserDetails(user);
    }
}
