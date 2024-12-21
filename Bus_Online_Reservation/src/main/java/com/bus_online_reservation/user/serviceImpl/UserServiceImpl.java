package com.bus_online_reservation.user.serviceImpl;

import com.bus_online_reservation.user.dto.RegisterRequest;
import com.bus_online_reservation.user.dto.UserRequest;
import com.bus_online_reservation.user.dto.UserResponse;
import com.bus_online_reservation.user.entity.User;
import com.bus_online_reservation.user.mapper.UserMapper;
import com.bus_online_reservation.user.repository.UserRepository;
import com.bus_online_reservation.user.serviceImpl.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final UserMapper mapper;
    private final PasswordEncoder encoder;

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }

    @Override
    public void update(Long id, UserRequest user) {
        User users = repository.findById(id).orElseThrow();
        mapper.updateFromDto(user, users);
        repository.save(users);

    }

    @Override
    public void create(UserRequest user) {
        User users = mapper.toEntity(user);
        repository.save(users);

    }

    @Override
    public UserResponse getById(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    public void register(RegisterRequest request) {
        User user= mapper.toUser(request);
        user.setPassword(encoder.encode(request.getPassword()));
        repository.save(user);
    }
}
